package cc.niushuai.study.springcloud.rabbitmq.scheduler;

import cc.niushuai.study.springcloud.rabbitmq.producer.HelloWorldProducer;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author ns
 * @date 2020/10/15
 */
@Component
public class SayScheduler {

    @Resource
    private HelloWorldProducer producer;

    @Scheduled(initialDelay = 3000L, fixedDelay = 2000L)
    public void say() {

        producer.sayHello();
        producer.sayEntity();
    }
}
