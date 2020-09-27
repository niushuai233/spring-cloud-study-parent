package cc.niushuai.study.springcloud.feign.user.servive;

import cc.niushuai.springcloud.api.common.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ns
 * @date 2020/9/27
 */
@FeignClient("spring-cloud-feign-user-service")
public interface UserService {

    @RequestMapping("/userService/clientUser/randomUser")
    Result randomUserInfo();
}
