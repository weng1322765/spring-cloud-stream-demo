package cn.ahub.consumer;


import cn.ahub.processor.KafkaMessageProcessor;
import cn.ahub.processor.RabbitMessageProcessor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class RabbitMessageStreamConsumer {

    @StreamListener(RabbitMessageProcessor.IN_PUT)
    @SendTo(KafkaMessageProcessor.OUT_PUT)
//    @SendTo(RabbitMessageProcessor.OUT_PUT)
    public Message recieveMessage(Message<String> message) {
        System.out.println("===== I got the message: " + message);
        return message;
    }
}
