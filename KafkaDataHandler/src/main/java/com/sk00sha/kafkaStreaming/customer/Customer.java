package com.sk00sha.kafkaStreaming.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    private int id;
    private int city_id;
    private String name;
    private Gender gender;
    private String address;
    private String dateOfRegistration;
}
