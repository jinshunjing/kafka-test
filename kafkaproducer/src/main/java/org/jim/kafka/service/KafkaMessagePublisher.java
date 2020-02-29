package org.jim.kafka.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaMessagePublisher {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void publish(String topic, String message) {
        log.info("publish kafka message entrance: topic={}, message={}", topic, message);
        kafkaTemplate.send(topic,  message);
        log.info("publish kafka message exit");
    }
}
