package cc.niushuai.study.springcloud.starter.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ns
 * @date 2020/9/22
 */
@SpringBootApplication
@MapperScan("cc.niushuai.study.springcloud.starter.mybatisplus.user.mapper")
public class SpringBootStarterMyBatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarterMyBatisPlusApplication.class);
    }
}
