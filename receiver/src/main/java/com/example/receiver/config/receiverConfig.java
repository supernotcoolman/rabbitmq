package com.example.receiver.config;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class receiverConfig {

    @Bean
    public Queue queue(){
        return new Queue("queue", false);
    }
}
