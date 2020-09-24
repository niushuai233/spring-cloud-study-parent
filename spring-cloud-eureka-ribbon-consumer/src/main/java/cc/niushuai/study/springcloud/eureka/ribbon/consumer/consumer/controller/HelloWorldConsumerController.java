package cc.niushuai.study.springcloud.eureka.ribbon.consumer.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author ns
 * @date 2020/9/24
 */
@RestController
@RequestMapping("/helloWorld/consumer")
public class HelloWorldConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping
    public String call() {

        String res = restTemplate.getForObject("http://niushuai-study-eureka-client-1/helloWorld", String.class);

        return res;
    }

}
