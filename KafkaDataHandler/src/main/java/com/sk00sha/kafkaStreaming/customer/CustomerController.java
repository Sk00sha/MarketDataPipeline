package com.sk00sha.kafkaStreaming.customer;

import com.sk00sha.kafkaStreaming.messageTypers.IncomingMessage;
import com.sk00sha.kafkaStreaming.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class CustomerController {
    @Autowired
    KafkaProducer<Customer> kafkaCustomerProducer;

    @PostMapping("/customer")
    public String sendCustomerData(@RequestBody IncomingMessage<Customer> incomingMessageCustomer){
        kafkaCustomerProducer.sendInvoice(incomingMessageCustomer.getTopicName(), incomingMessageCustomer.getKey(),incomingMessageCustomer.getDataPayload());
        return String.format("Produced message -Key: %s -Value: %s to -Topic: %s ",
                incomingMessageCustomer.getKey(),
                incomingMessageCustomer.getDataPayload().toString(),
                incomingMessageCustomer.getTopicName());
    }
}
