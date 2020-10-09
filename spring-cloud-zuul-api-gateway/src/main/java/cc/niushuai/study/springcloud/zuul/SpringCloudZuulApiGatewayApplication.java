package cc.niushuai.study.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author ns
 * @date 2020/9/29
 */
@EnableZuulProxy
@SpringCloudApplication
public class SpringCloudZuulApiGatewayApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudZuulApiGatewayApplication.class);
    }
}
