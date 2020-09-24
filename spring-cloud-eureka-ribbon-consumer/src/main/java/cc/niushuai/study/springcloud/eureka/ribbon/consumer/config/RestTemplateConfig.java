package cc.niushuai.study.springcloud.eureka.ribbon.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ns
 * @date 2020/9/24
 */
@Configuration
public class RestTemplateConfig {

    /**
     * LoadBalanced 负载均衡
     *
     * @param
     * @return org.springframework.web.client.RestTemplate
     *
     * @author ns
     * @date 2020/9/24 14:13
     **/
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {

        return new RestTemplate();
    }
}
