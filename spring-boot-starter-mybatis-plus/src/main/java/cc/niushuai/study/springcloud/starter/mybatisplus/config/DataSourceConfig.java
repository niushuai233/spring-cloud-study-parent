package cc.niushuai.study.springcloud.starter.mybatisplus.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource(){

        System.out.println("dataSource init");
        return DataSourceBuilder.create().driverClassName("org.h2.Driver").url("jdbc:h2:mem:test").username("root").password("test").build();
    }
}
