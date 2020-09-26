package cc.niushuai.study.springcloud.eureka.client1.helloworld.controller;

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
    public String helloWorld() {

        return "Hello World! client 1";
    }

    @RequestMapping
    public String helloWorld(String name, String age) {

        return "";
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
