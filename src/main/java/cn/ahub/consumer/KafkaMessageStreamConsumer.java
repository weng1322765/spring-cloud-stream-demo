package cn.ahub.consumer;

import cn.ahub.processor.KafkaMessageProcessor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageStreamConsumer {

    @StreamListener(KafkaMessageProcessor.IN_PUT)
    public void recieveMessage(Message<String> message) {
        System.out.println("===== I got the kafka message: " + message);
    }
}
