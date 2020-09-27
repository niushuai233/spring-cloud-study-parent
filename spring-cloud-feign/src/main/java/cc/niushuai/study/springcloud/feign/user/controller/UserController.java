package cc.niushuai.study.springcloud.feign.user.controller;

import cc.niushuai.springcloud.api.common.entity.Result;
import cc.niushuai.study.springcloud.feign.user.servive.UserService;
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

        System.out.println(result);

        log.info("code: {}", result.getCode());
        log.info("msg: {}", result.getMsg());

        Map<String, Object> data = (Map<String, Object>) result.getData();
        log.info("data: {}", data);

        return Result.success(data);
    }

}
