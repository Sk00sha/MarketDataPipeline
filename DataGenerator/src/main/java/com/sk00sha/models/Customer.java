package com.sk00sha.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class Customer {
    private int id;
    private int city_id;
    private String name;
    private Gender gender;
    private String address;
    private String dateOfRegistration;
}
