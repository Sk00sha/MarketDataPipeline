package com.sk00sha.generator;

import com.sk00sha.customDataStructures.MyTriplet;
import com.sk00sha.customDataStructures.RandomNumber;
import com.sk00sha.models.Customer;

import java.util.List;

public class GeneratorRunner {
    private final List<MyTriplet<String, String, String>> itemList;
    private final List<MyTriplet<String, String, String>> customerList;

    public GeneratorRunner(List<MyTriplet<String,String,String>> itemList, List<MyTriplet<String,String,String>> customerList){
        this.itemList=itemList;
        this.customerList=customerList;
    }

    private String returnFromArrayIndex(List<MyTriplet<String,String,String>> innerList,int indexOfTriplet,int randomListIndex){
        if (indexOfTriplet<0 || indexOfTriplet>3){
            throw new IndexOutOfBoundsException();
        }
        return switch (indexOfTriplet) {
            case 0 -> innerList.get(randomListIndex).getFirstValue();
            case 1 -> innerList.get(randomListIndex).getSecondValue();
            case 2 -> innerList.get(randomListIndex).getThirdValue();
            default -> null;
        };

    }
    public void runGenerators(){
        InvoiceGenerator generatorOfInvoices = new InvoiceGenerator();
        CustomerGenerator generatorOfCustomers = new CustomerGenerator();

        Customer customer = new Customer.CustomerBuilder(
                returnFromArrayIndex(this.customerList,1,1)
                ,returnFromArrayIndex(this.customerList,0,1)
                ,returnFromArrayIndex(this.customerList,2,1))
                .addCityID(1).build();

/*
        while(true){
            var randomItemAtIndex = RandomNumber.getRandomIntNumber(0,99);
            var randomUserAtIndex = RandomNumber.getRandomIntNumber(0,39);
            Customer customer = new Customer.CustomerBuilder(
                    Integer.getInteger(returnFromArrayIndex(1,randomUserAtIndex))
                    ,returnFromArrayIndex(2,randomUserAtIndex)
                    ,returnFromArrayIndex(3,randomUserAtIndex)).build();

        }*/
    }

}
