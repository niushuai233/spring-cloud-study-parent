package cc.niushuai.study.springcloud.zuul.config;

import cc.niushuai.study.springcloud.zuul.filter.AccessFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ns
 * @date 2020/10/9
 */
@Configuration
public class FilterConfig {

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
