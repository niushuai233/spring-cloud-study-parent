package cc.niushuai.study.springcloud.eureka.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ns
 * @date 2020/9/23
 */
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudEruekaClient1Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudEruekaClient1Application.class);
    }
}
