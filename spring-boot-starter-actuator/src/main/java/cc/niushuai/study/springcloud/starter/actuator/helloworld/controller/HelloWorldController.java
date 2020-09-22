package cc.niushuai.study.springcloud.starter.actuator.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ns
 * @date 2020/9/21
 */
@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {


    @RequestMapping
    public String sayHello() {

        return "Hello World!";
    }
}
