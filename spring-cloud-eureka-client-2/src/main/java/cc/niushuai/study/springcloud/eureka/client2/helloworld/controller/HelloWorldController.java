package cc.niushuai.study.springcloud.eureka.client2.helloworld.controller;

import cn.hutool.core.util.RandomUtil;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ns
 * @date 2020/9/23
 */
@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {

    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping
    public String sayHello() throws InterruptedException {

        long millis = RandomUtil.randomLong(0L, 3000L);
        System.out.println(millis);
        Thread.sleep(millis);

        return "Hello World! client 2";
    }

    @RequestMapping("/info")
    public String info() {

        List<ServiceInstance> list = new ArrayList<>();
        List<String> services = discoveryClient.getServices();

        for (String service : services) {
            list.addAll(discoveryClient.getInstances(service));
        }

        ServiceInstance instance = list.get(0);
        return instance.getHost() + "|" + instance.getInstanceId() + "|" + instance.getScheme() + "|" + instance.getServiceId() + "|" + instance.getMetadata() + "|" + instance.getUri() + "|" + instance.getPort();
    }
}
