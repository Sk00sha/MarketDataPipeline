package com.sk00sha.generator;

import com.sk00sha.customDataStructures.RandomNumber;
import com.sk00sha.models.Customer;
import com.sk00sha.models.Gender;

public class CustomerGenerator implements GenericDataGenerator<Customer, Customer.CustomerBuilder> {

    @Override
    public Customer generateSpecificObject(Customer.CustomerBuilder objectToGenerate,int randomPosition) {
        return null;
    }
    /**
     * Based on the customer file and each objects pos. in the list
     * @param id
     * @return
     */
    private Gender generateRandomGender(int id){
        if(id % 3==0 && id!=0){
            return Gender.MALE;
        }
        return Gender.FEMALE;
    }
    private int generateRandomCityID(){
        return RandomNumber.getRandomIntNumber(0,100);
    }


}
