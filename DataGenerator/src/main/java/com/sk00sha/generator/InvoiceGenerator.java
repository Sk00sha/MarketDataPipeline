package com.sk00sha.generator;

import com.sk00sha.models.Invoice;
import com.sk00sha.models.PurchaseOrigin;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Format used is Toaster:1:Kitchen Appliances Name:ID:Category
 */
public class InvoiceGenerator implements GenericDataGenerator<Invoice> {
    private int customerId;
    @Override
    public Invoice generateSpecificObject(String itemID, String itemName, String category) {
        return new Invoice(UUID.randomUUID().toString()
                ,customerId,2,Integer.getInteger(itemID)
                ,"","", PurchaseOrigin.STORE
                ,category, BigDecimal.ONE);
    }
    public void setSharedProperty(String customerId){

    }
}
