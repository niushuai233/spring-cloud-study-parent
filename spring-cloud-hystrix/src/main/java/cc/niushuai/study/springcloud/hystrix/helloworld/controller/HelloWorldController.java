package cc.niushuai.study.springcloud.hystrix.helloworld.controller;

import cc.niushuai.study.springcloud.hystrix.helloworld.service.HelloWorldService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author ns
 * @date 2020/9/24
 */
@RestController
@RequestMapping("/hystrix/helloWorld")
public class HelloWorldController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HelloWorldService helloWorldService;


    @RequestMapping("/call")
    public String call() {

        return restTemplate.getForObject("http://niushuai-study-eureka-client/helloWorld", String.class);
    }

    @RequestMapping("/call2")
    public String call2() {

        return helloWorldService.call2("xyz");
    }

}
