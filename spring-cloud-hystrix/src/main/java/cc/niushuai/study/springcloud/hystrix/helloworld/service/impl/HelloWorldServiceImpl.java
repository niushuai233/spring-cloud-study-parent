package cc.niushuai.study.springcloud.hystrix.helloworld.service.impl;

import cc.niushuai.study.springcloud.hystrix.helloworld.service.HelloWorldService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rx.Observable;
import rx.Subscriber;

import javax.annotation.Resource;

/**
 * @author ns
 * @date 2020/9/24
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Resource
    private RestTemplate restTemplate;

    @Override
    public String call2() {
        return null;
    }

    @Override
    @HystrixCommand(fallbackMethod = "callFallback")
    public String call2(String str) {
        return restTemplate.getForObject("http://niushuai-study-eureka-client/helloWorld", String.class);
    }

    public String callFallback(String str) {
        return "call2 error " + str;
    }


    @SuppressWarnings("deprecated")
    public void obsTest() {

        Observable<String> observable = Observable.create(subscriber -> {
            subscriber.onNext("Hello RxJava");
            subscriber.onNext("this is niushuai");
            subscriber.onCompleted();
        });

        Subscriber<String> subscriber = new Subscriber<String>() {

            @Override
            public void onCompleted() {
                System.out.println("on complete");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("on error: " + e);
            }

            @Override
            public void onNext(String s) {
                System.out.println("on next: " + s);
            }
        };


        observable.subscribe(subscriber);

    }
}
