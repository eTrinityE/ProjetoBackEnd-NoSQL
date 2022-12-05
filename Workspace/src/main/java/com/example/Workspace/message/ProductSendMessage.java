package com.example.Workspace.message;

import com.example.Workspace.entidades.Log;
import com.example.Workspace.entidades.Produtos;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductSendMessage {

    @Value("${store.rabbitmq.exchange}")
    String exchange;

    @Value("${store.rabbitmq.routingkey}")
    String routingKey;

    @Value("${store.rabbitmq.routingkey}")
    String routingKeyBase;


    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(Log log) {
        rabbitTemplate.convertAndSend(exchange, routingKey, log);
    }
}
