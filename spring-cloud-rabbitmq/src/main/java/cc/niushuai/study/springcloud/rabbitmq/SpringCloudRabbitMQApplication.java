package cc.niushuai.study.springcloud.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author ns
 * @date 2020/10/15
 */
@EnableScheduling
@SpringBootApplication
public class SpringCloudRabbitMQApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudRabbitMQApplication.class);
    }
}
