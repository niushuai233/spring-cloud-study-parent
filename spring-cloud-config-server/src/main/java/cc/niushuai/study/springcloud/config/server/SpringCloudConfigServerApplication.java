package cc.niushuai.study.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ns
 * @date 2020/10/10
 */
@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudConfigServerApplication.class);
    }
}
