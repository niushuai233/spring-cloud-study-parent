package cc.niushuai.study.springcloud.eureka.client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ns
 * @date 2020/9/23
 */
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudEruekaClient2Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudEruekaClient2Application.class);
    }
}
