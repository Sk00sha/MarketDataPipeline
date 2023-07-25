package com.sk00sha.generator;

import com.sk00sha.customDataStructures.MyTriplet;
import com.sk00sha.customDataStructures.RandomNumber;
import com.sk00sha.models.Customer;
import com.sk00sha.models.Invoice;


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
        var randomUserAtIndex = RandomNumber.getRandomIntNumber(0,39);
        var randomItemAtIndex = RandomNumber.getRandomIntNumber(0,99);

        InvoiceGenerator generatorOfInvoices = new InvoiceGenerator();
        CustomerGenerator generatorOfCustomers = new CustomerGenerator();

        Customer customer = generatorOfCustomers.generateSpecificObject(new Customer.CustomerBuilder(
                returnFromArrayIndex(this.customerList,1,randomUserAtIndex)
                ,returnFromArrayIndex(this.customerList,0,randomUserAtIndex)
                ,returnFromArrayIndex(this.customerList,2,randomUserAtIndex)
                ),randomUserAtIndex);


        //Should remake to proper types in objects but no time(id should be int and not String)
        Invoice invoice = generatorOfInvoices.generateSpecificObject(
                new Invoice.InvoiceBuilder(
                        returnFromArrayIndex(this.itemList,1,randomItemAtIndex),
                        customer.getId(),
                        returnFromArrayIndex(this.itemList,0,randomItemAtIndex)
                        ,returnFromArrayIndex(this.itemList,2,randomItemAtIndex))
                ,randomItemAtIndex);

        System.out.println(customer);
        System.out.println(invoice);
    }

}
