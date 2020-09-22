package cc.niushuai.study.springcloud.starter.actuator.config;

import cn.hutool.core.util.RandomUtil;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author ns
 * @date 2020/9/22
 */
@Component
public class HelloWorldHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        System.out.println("HelloWorldHealthIndicator");

        return Health.up().withDetail("val", "Hello World!").build();
    }
}
