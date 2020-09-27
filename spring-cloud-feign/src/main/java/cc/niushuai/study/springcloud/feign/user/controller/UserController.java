package cc.niushuai.study.springcloud.feign.user.controller;

import cc.niushuai.springcloud.api.common.entity.Result;
import cc.niushuai.springcloud.api.user.entity.ClientUser;
import cc.niushuai.study.springcloud.feign.user.servive.UserService;
import cn.hutool.core.bean.BeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author ns
 * @date 2020/9/27
 */
@Slf4j
@RestController
@RequestMapping("/feign/user/")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/testReturn")
    public Result testReturn() {
        return Result.success("congratulation!");
    }

    @RequestMapping("/testReturnMap")
    public Map<String, Object> testReturnMap() {
        return Result.success("congratulation! map");
    }

    @RequestMapping("/randomUser")
    public Result randomUser() {

        Result result = userService.randomUserInfo();

        System.out.println(result);

        log.info("code: {}", result.getCode());
        log.info("msg: {}", result.getMsg());
        log.info("data: {}", result.getData());

        return result;
    }

    @RequestMapping("/randomUserNew")
    public Result randomUserNew() {

        Result result = userService.randomUserInfo();

        if (result.getCode() != 200) {
            return result;
        }
        System.out.println(result);

        log.info("code: {}", result.getCode());
        log.info("msg: {}", result.getMsg());

        Map<String, Object> data = (Map<String, Object>) result.getData();
        log.info("data: {}", data);


        return Result.success(data).put("serverId", result.get("serverId")).put("sleepTime", result.get("sleepTime"));
    }

    public Result randomUserNewFallback() {
        log.info("fallback");
        return Result.error("randomUserNewFallback");
    }

    @RequestMapping("/getUserInfo")
    public Result getUserInfo1(String name, Integer age) {

        Result result1 = userService.getUserInfo1(name, age);
        Result result2 = userService.getUserInfo2(name, age);
        Result result3 = userService.getUserInfo3(new ClientUser(name, age));

        return Result.success()
                .put("result1", printAndReturnClientUser(result1))
                .put("result2", printAndReturnClientUser(result2))
                .put("result3", printAndReturnClientUser(result3));
    }

    @SuppressWarnings("deprecated")
    private ClientUser printAndReturnClientUser(Result result1) {

        log.info("code: {}", result1.getCode());
        log.info("msg: {}", result1.getMsg());
        log.info("data: {}", result1.getData());

        return BeanUtil.mapToBean((Map<String, Object>) result1.getData(), ClientUser.class, true);

    }


}
