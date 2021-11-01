package com.example.producerrabbitmq.service.impl;

import com.example.producerrabbitmq.facade.ProducerFacade;
import com.example.producerrabbitmq.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private ProducerFacade producerFacade;

    @Override
    public void sendMessage(String message) {
        producerFacade.sendMessage(message);
    }
}
