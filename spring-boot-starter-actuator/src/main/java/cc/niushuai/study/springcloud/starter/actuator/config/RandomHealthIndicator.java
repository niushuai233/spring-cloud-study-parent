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
public class RandomHealthIndicator implements HealthIndicator {


    @Override
    public Health health() {

        System.out.println("RandomHealthIndicator");

        return RandomUtil.randomInt(1, 10) % 2 == 0 ? Health.up().build() : Health.down().withDetail("code", "500").withDetail("msg", "余数不为0").build();
    }
}
