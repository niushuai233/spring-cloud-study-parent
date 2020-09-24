package cc.niushuai.study.springcloud.eureka.server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ns
 * @date 2020/9/23
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEruekaServer1Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudEruekaServer1Application.class);
    }
}
