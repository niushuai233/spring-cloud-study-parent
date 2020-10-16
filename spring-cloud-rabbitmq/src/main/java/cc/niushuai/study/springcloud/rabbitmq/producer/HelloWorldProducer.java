package cc.niushuai.study.springcloud.rabbitmq.producer;

import cc.niushuai.springcloud.api.common.entity.Result;
import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author ns
 * @date 2020/10/15
 */
@Slf4j
@Component
public class HelloWorldProducer {

    @Resource
    private AmqpTemplate amqpTemplate;

    public void sayHello() {

        String context = "someone say hello world at " + DateUtil.now();

        log.info("HelloWorldProducer send msg: {}", context);

        amqpTemplate.convertAndSend("routing-hw", context);
    }

    public void sayEntity() {

        String context = "entity say hello world at " + DateUtil.now();

        log.info("HelloWorldProducer send entity msg: {}", context);

        Result success = Result.success(context);
        log.info("success: {}", success);
        amqpTemplate.convertAndSend("routing-hw-entity", success);
    }

}
