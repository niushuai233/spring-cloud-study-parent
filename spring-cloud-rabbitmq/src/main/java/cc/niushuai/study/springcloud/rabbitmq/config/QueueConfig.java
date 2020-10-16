package cc.niushuai.study.springcloud.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author ns
 * @date 2020/10/15
 */
@Configuration
public class QueueConfig {

    @Bean
    public Queue routingHw() {
        return new Queue("routing-hw");
    }

    @Bean
    public Queue routingHwEntity() {
        return new Queue("routing-hw-entity");
    }
}
