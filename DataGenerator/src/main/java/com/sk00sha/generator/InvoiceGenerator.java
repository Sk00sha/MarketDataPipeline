package com.sk00sha.generator;

import com.sk00sha.models.Invoice;
import lombok.Setter;
import com.sk00sha.customDataStructures.RandomNumber;
import java.math.BigDecimal;


/**
 * Format used is Toaster:1:Kitchen Appliances Name:ID:Category
 */
@Setter
public class InvoiceGenerator implements GenericDataGenerator<Invoice, Invoice.InvoiceBuilder> {

    @Override
    public Invoice generateSpecificObject(Invoice.InvoiceBuilder objectToGenerate,int randomPosition) {
        return objectToGenerate
                .addDateOfPurchase(setDateOfPurchase(randomPosition))
                .addOrigin(setOriginOfPurchase(randomPosition))
                .addPrice(setPrice(randomPosition))
                .addPaymentMethod(setPaymentMethod(randomPosition))
                .build();
    }

    private String setDateOfPurchase(int randomPosition) {
        return null;
    }

    private String setPaymentMethod(int randomPosition){

        return null;
    }
    private String setOriginOfPurchase(int randomPosition){

        return null;
    }
    private BigDecimal setPrice(int randomPosition){

        return BigDecimal.valueOf(RandomNumber.getRandomIntNumber(0,1000));
    }
    private boolean isEven(int number) {
        return number % 2 == 0;
    }


}
