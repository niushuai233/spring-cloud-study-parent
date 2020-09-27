package cc.niushuai.study.springcloud.feign.user.servive;

import cc.niushuai.springcloud.api.common.entity.Result;
import cc.niushuai.springcloud.api.user.entity.ClientUser;
import cc.niushuai.study.springcloud.feign.user.servive.fallback.UserServiceFallback;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ns
 * @date 2020/9/27
 */
@FeignClient(value = "spring-cloud-feign-user-service", fallbackFactory = UserServiceFallback.class)
public interface UserService {

    @RequestMapping("/userService/clientUser/randomUser")
    @HystrixCommand(fallbackMethod = "randomUserNewFallback")
    Result randomUserInfo();

    default Result randomUserNewFallback() {
        System.out.println("fallback");
        return Result.error("randomUserNewFallback");
    }

    @RequestMapping("/userService/clientUser/getUserInfo1")
    Result getUserInfo1(@RequestParam("name") String name, @RequestParam("age") Integer age);

    @RequestMapping("/userService/clientUser/getUserInfo2")
    Result getUserInfo2(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping("/userService/clientUser/getUserInfo3")
    Result getUserInfo3(@RequestBody ClientUser clientUser);
}
