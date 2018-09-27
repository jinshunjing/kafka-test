package org.jim.kafka.controller;

import org.jim.kafka.service.KafkaMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("sayHelloCtrl")
@RequestMapping("/kafka")
public class TickerController {

    @Autowired
    private KafkaMessagePublisher kafkaMessagePublisher;

    @GetMapping(value="/ticker")
    public void ticker() {
        kafkaMessagePublisher.publish("test.ticker", "Ticker: " + System.currentTimeMillis());
    }

}
