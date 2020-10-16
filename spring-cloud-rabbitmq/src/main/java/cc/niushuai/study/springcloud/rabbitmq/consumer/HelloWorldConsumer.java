package cc.niushuai.study.springcloud.rabbitmq.consumer;

import cc.niushuai.springcloud.api.common.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author ns
 * @date 2020/10/15
 */
@Slf4j
@Component
@RabbitListener(queues = {"routing-hw", "routing-hw-entity"})
public class HelloWorldConsumer {

    @RabbitHandler
    public void receiveHelloWorld(String context) {

        log.info("routing-hw receive context: {}", context);
    }

    @RabbitHandler
    public void receiveEntity(Result result) {

        log.info("routing-hw-entity receive result: {}", result);
    }
}
