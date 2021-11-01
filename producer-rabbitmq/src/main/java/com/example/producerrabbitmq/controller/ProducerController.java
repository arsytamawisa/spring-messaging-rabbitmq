package com.example.producerrabbitmq.controller;

import com.example.producerrabbitmq.service.ProducerService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @PostMapping(value = "api/sendMessage", consumes = "application/json")
    public ResponseEntity sendMessage(@RequestBody String message) {
        producerService.sendMessage(message);
        return new ResponseEntity(HttpStatus.OK);
    }

}
