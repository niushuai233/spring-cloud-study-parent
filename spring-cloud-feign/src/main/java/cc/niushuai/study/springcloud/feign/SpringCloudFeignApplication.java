package cc.niushuai.study.springcloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ns
 * @date 2020/9/24
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudFeignApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudFeignApplication.class);
    }
}
