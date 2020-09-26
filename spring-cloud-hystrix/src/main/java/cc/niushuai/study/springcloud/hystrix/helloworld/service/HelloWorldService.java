package cc.niushuai.study.springcloud.hystrix.helloworld.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author ns
 * @date 2020/9/24
 */
public interface HelloWorldService {
    String call2();

    @HystrixCommand(fallbackMethod = "callFallback")
    String call2(String str);
}
