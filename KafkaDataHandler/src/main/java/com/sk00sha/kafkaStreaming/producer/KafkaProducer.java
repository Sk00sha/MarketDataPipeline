package com.sk00sha.kafkaStreaming.producer;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class KafkaProducer<T> {
    @Autowired
    private KafkaTemplate<String, T> kafkaTemplate;

    public void sendInvoice(String topic, String key, T value){
        log.info(String.format("Produced message -Key: %s -Value: %s to -Topic: %s ", key, value, topic));
        kafkaTemplate.send(topic,key,value);
    }
}
