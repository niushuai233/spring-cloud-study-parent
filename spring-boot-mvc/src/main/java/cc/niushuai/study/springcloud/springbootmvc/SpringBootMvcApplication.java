package cc.niushuai.study.springcloud.springbootmvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
public class SpringBootMvcApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootMvcApplication.class, args);
	}

}
