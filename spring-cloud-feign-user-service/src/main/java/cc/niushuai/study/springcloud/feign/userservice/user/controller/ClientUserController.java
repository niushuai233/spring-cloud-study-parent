package cc.niushuai.study.springcloud.feign.userservice.user.controller;

import cc.niushuai.springcloud.api.common.entity.Result;
import cc.niushuai.springcloud.api.user.entity.ClientUser;
import cn.hutool.core.util.RandomUtil;
import org.springframework.web.bind.annotation.*;

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


    @RequestMapping("/getUserInfo1")
    public Result getUserInfo1(@RequestParam String name, @RequestParam Integer age) {
        name += RandomUtil.randomChar("askldhdjkfhgsdjkhfsfjkdghsfjkdghsfjkdj");
        age = age + 1;

        return Result.success(new ClientUser(name, age));
    }

    @RequestMapping("/getUserInfo2")
    public Result getUserInfo2(@RequestHeader String name, @RequestHeader Integer age) {

        name += RandomUtil.randomChar("askldhdjkfhgsdjkhfsfjkdghsfjkdghsfjkdj");
        age = age + 2;

        return Result.success(new ClientUser(name, age));
    }

    @RequestMapping("/getUserInfo3")
    public Result getUserInfo3(@RequestBody ClientUser clientUser) {

        char aChar = RandomUtil.randomChar("askldhdjkfhgsdjkhfsfjkdghsfjkdghsfjkdj");

        clientUser.setName(clientUser.getName() + aChar)
                .setAge(clientUser.getAge() + 3);

        return Result.success(clientUser);
    }
}
