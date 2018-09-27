package org.jim.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.jim.kafka")
public class KafkaProducerApp {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerApp.class, args);
    }

}

