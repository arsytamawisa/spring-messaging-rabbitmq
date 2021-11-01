package com.example.producerrabbitmq.facade.impl;

import com.example.producerrabbitmq.facade.ProducerFacade;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProducerFacadeImpl implements ProducerFacade {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${rabbit.queue.name}")
    private String queueName;

    @Override
    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(queueName, message);
    }
}
