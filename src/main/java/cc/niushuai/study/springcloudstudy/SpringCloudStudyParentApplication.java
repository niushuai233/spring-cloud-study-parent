package cc.niushuai.study.springcloudstudy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringCloudStudyParentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStudyParentApplication.class, args);
        log.info("this is a project to study spring boot of niushuai");
    }
}
