package cc.niushuai.study.springcloud.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ns
 * @date 2020/9/24
 */
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudHystrixApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudHystrixApplication.class);
    }
}
