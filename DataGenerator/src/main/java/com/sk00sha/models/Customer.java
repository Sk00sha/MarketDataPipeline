package com.sk00sha.models;

import lombok.*;

@Data
@Setter
@Getter
public class Customer {
    private String id;
    private int city_id;
    private String name;
    private Gender gender;
    private String address;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", city_id=" + city_id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }

    public Customer(CustomerBuilder builder) {
        this.id = builder.id;
        this.city_id = builder.cityID;
        this.name = builder.name;
        this.gender = builder.gender;
        this.address = builder.address;
    }

    public static class CustomerBuilder{
        private String id;
        private String name;
        private String address;
        /**
         * -----OPTIONALS----
         */
        private int cityID;
        private Gender gender;


        public CustomerBuilder(String id, String name, String address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }
        public CustomerBuilder addGender(Gender gender){
            this.gender=gender;
            return this;
        }
        public CustomerBuilder addCityID(int cityID){
            this.cityID=cityID;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }
}
