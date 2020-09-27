package cc.niushuai.study.springcloud.feign.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ns
 * @date 2020/9/26
 */
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudFeignUserServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudFeignUserServiceApplication.class);
    }
}
