package com.rp5.cao.config;


import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;

@Configuration
public class BrokerConfig {
    @Value("${cao.rabbitmq.exchange}")
    String exchange;


    @Bean
    public Exchange exchange(){
        return ExchangeBuilder.directExchange(exchange).durable(true).build();
    }


    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}
