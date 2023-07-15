package com.sk00sha.generator;

import com.sk00sha.customDataStructures.RandomNumber;
import com.sk00sha.models.Customer;
import com.sk00sha.models.Gender;

public class CustomerGenerator implements GenericDataGenerator<Customer> {
    @Override
    public Customer generateSpecificObject(String name, String id, String address) {

        return new Customer(Integer.getInteger(id),1,name, Gender.MALE,address);
    }
    private Gender generateRandomGender(int id){
        if(id % 3==0){
            return Gender.MALE;
        }
        return Gender.FEMALE;
    }
    private int generateRandomCityID(int id){
        return RandomNumber.getRandomIntNumber(0,100);
    }
}
