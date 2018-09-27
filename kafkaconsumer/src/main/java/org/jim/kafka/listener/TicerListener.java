package org.jim.kafka.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

@Slf4j
public class TicerListener {

    @KafkaListener(topics = {"test.ticker"})
    public void listen(ConsumerRecord<?, ?> record) {
        log.info("listen entrance");
        String msg = record.value().toString();
        log.info("mesage: {}", msg);
        log.info("listen exit");
    }

}
