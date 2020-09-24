package cc.niushuai.study.springcloud.eureka.server2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ns
 * @date 2020/9/23
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEruekaServer2Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudEruekaServer2Application.class);
    }
}
