package com.sk00sha.kafkaStreaming.messageTypers;

import lombok.Data;

@Data
public class IncomingMessage<T> {
    private String topicName;
    private String key;
    private T dataPayload;
}
