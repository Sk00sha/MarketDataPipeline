package com.sk00sha.generator;

import com.sk00sha.customDataStructures.MyTriplet;
import com.sk00sha.customDataStructures.RandomNumber;

import java.util.List;

public class GeneratorRunner {
    private final List<MyTriplet<String, String, String>> itemList;
    private final List<MyTriplet<String, String, String>> customerList;

    public GeneratorRunner(List<MyTriplet<String,String,String>> itemList, List<MyTriplet<String,String,String>> customerList){
        this.itemList=itemList;
        this.customerList=customerList;
    }
    public void runGenerators(){
        InvoiceGenerator generatorOfInvoices = new InvoiceGenerator();
        CustomerGenerator generatorOfCustomers = new CustomerGenerator();

        while(true){
            var randomItemAtIndex = RandomNumber.getRandomIntNumber(0,99);
            var randomUserAtIndex = RandomNumber.getRandomIntNumber(0,39);

            generatorOfCustomers.generateSpecificObject(customerList.get(randomUserAtIndex).getFirstValue()
                    ,customerList.get(randomUserAtIndex).getSecondValue()
                    ,customerList.get(randomUserAtIndex).getThirdValue());

            generatorOfInvoices.setSharedProperty(customerList.get(randomUserAtIndex).getSecondValue(),);
            generatorOfInvoices.generateSpecificObject(itemList.get(randomItemAtIndex).getFirstValue()
                    ,itemList.get(randomItemAtIndex).getSecondValue()
                    ,itemList.get(randomItemAtIndex).getThirdValue());
        }
    }

}
