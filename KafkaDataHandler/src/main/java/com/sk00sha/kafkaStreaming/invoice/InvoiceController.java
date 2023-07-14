package com.sk00sha.kafkaStreaming.invoice;

import com.sk00sha.kafkaStreaming.messageTypers.IncomingMessage;
import com.sk00sha.kafkaStreaming.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class InvoiceController {
    @Autowired
    KafkaProducer<Invoice> kafkaInvoiceProducer;

    @PostMapping("/invoices")
    public String sendMessageToKafka(@RequestBody IncomingMessage<Invoice> incomingMessage){
        kafkaInvoiceProducer.sendInvoice(incomingMessage.getTopicName(), incomingMessage.getKey(), incomingMessage.getDataPayload());
        return String.format("Produced message -Key: %s -Value: %s to -Topic: %s ",
                incomingMessage.getKey(),
                incomingMessage.getDataPayload().toString(),
                incomingMessage.getTopicName());
    }

}
