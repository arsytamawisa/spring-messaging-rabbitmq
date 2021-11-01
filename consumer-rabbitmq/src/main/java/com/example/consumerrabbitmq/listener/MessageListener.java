package com.example.consumerrabbitmq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = "q.one")
    public void receiveMessage(String message) {
        System.out.println("Message Received: " + message);
    }

}
