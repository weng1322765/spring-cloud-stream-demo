package cn.ahub.processor;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface KafkaMessageProcessor {

    String IN_PUT = "my-scs-kafka-output";

    String OUT_PUT = "my-scs-kafka-output";

    @Output(OUT_PUT)
    MessageChannel output();
}
