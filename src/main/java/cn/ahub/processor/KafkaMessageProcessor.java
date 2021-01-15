package cn.ahub.processor;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface KafkaMessageProcessor {

    String IN_PUT = "my-scs-kafka-input";

    String OUT_PUT = "my-scs-kafka-output";

    @Output(OUT_PUT)
    MessageChannel output();

    @Input(IN_PUT)
    SubscribableChannel input();
}
