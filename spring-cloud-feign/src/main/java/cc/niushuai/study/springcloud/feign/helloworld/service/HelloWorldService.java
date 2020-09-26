package cc.niushuai.study.springcloud.feign.helloworld.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ns
 * @date 2020/9/26
 */
@FeignClient("niushuai-study-eureka-client")
public interface HelloWorldService {

    @RequestMapping("/helloWorld")
    String sayHello();
}
