package com.example.Log.message;

import com.example.Log.entidades.Log;
import com.example.Log.service.LogService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class LogRecieveMessage {
    @Autowired
    private LogService logService;
    @RabbitListener(queues = {"${store.rabbitmq.queue}"})
    public void receive(@Payload Log log) {
        logService.create(log);
    }


}
