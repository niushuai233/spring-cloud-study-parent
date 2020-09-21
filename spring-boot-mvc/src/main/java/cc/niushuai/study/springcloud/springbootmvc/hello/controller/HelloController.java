package cc.niushuai.study.springcloud.springbootmvc.hello.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ns
 * @date 2020/9/21
 */
@RestController
@RequestMapping
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello() {

        return "Hello World!";
    }
}
