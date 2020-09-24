package cc.niushuai.study.springcloud.eureka.ribbon.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ns
 * @date 2020/9/24
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudEurekaRibbonConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudEurekaRibbonConsumerApplication.class);
    }
}
