package cc.niushuai.study.springcloud.feign.userservice.user.controller;

import cc.niushuai.springcloud.api.common.entity.Result;
import cc.niushuai.springcloud.api.user.entity.ClientUser;
import cn.hutool.core.util.RandomUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ns
 * @date 2020/9/26
 */
@RestController
@RequestMapping("/userService/clientUser")
public class ClientUserController {

    @RequestMapping("/randomUser")
    public Result randomUser() {

        int age = RandomUtil.randomInt(17, 100);

        ClientUser clientUser = new ClientUser().setName("张" + age).setAge(age);

        System.out.println(clientUser);
        return Result.success().put("data", clientUser);
    }
}
