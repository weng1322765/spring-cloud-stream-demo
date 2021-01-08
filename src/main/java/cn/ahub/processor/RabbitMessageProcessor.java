package cn.ahub.processor;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface RabbitMessageProcessor {

    String IN_PUT = "my-scs-input";

    String OUT_PUT = "my-scs-output";

    @Input(IN_PUT)
    SubscribableChannel input();

    @Output(OUT_PUT)
    MessageChannel output();
}
