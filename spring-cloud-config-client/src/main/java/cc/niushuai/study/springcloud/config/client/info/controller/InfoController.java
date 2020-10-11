package cc.niushuai.study.springcloud.config.client.info.controller;

import cc.niushuai.springcloud.api.common.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ns
 * @date 2020/10/11
 */
@Slf4j
@RestController
@RequestMapping("/client/info")
public class InfoController {


    @Value("${niushuai.data.name}")
    private String name;
    @Value("${niushuai.data.age}")
    private Integer age;
    @Value("${niushuai.data.type}")
    private String type;
    @Value("${niushuai.data.env}")
    private String env;

    @Resource
    private Environment environment;

    @RequestMapping
    public Result info() {

        return Result.success().put("way", "@Value").put("name", name).put("age", age).put("type", type).put("env", env);
    }

    @RequestMapping("/env")
    public Result env() {
        return Result.success().put("way", "environment").put("name", environment.getProperty("niushuai.data.name")).put("age", age).put("type", type).put("env", env);
    }
}
