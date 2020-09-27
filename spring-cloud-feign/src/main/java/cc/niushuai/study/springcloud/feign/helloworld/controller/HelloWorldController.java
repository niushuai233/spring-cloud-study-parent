package cc.niushuai.study.springcloud.feign.helloworld.controller;

import cc.niushuai.study.springcloud.feign.helloworld.service.HelloWorldService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ns
 * @date 2020/9/26
 */
@RestController
@RequestMapping("/feign/helloWorld")
public class HelloWorldController {

    @Resource
    private HelloWorldService helloWorldService;


    @RequestMapping("/sayHello")
    public String sayHello() {

        return helloWorldService.sayHello();
    }
}
