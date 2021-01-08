package cn.ahub.controller;

import cn.ahub.processor.RabbitMessageProcessor;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMessageController {

    private final RabbitMessageProcessor rabbitMessageProcessor;

    public RabbitMessageController(RabbitMessageProcessor rabbitMessageProcessor) {
        this.rabbitMessageProcessor = rabbitMessageProcessor;
    }

    @GetMapping("/test/message/{msg}")
    public String getMessage(@PathVariable String msg) {
        rabbitMessageProcessor.output().send(MessageBuilder.withPayload(msg).build());
        return "success";
    }
}
