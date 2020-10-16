package cc.niushuai.study.springcloud.stream.receiver;

import cc.niushuai.springcloud.api.user.entity.ClientUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author ns
 * @date 2020/10/16
 */
@Slf4j
@EnableBinding(Sink.class)
public class SinkReceiver {


    @StreamListener(Sink.INPUT)
    public void receive(ClientUser clientUser) {

        log.info("Sink Receiver: {}", clientUser);
    }

}
