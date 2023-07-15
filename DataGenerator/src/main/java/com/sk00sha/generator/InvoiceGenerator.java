package com.sk00sha.generator;

import com.sk00sha.models.Invoice;
import com.sk00sha.models.PurchaseOrigin;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Format used is Toaster:1:Kitchen Appliances Name:ID:Category
 */
@Setter
public class InvoiceGenerator implements GenericDataGenerator<Invoice> {
    private int customerId;
    private String paymentMethod;
    private String dateOfPurchase;
    private String originOfPurchase;
    @Override
    public Invoice generateSpecificObject(String itemID, String itemName, String category) {
        return new Invoice(UUID.randomUUID().toString()
                ,customerId,itemName,Integer.getInteger(itemID)
                ,dateOfPurchase,paymentMethod, originOfPurchase
                ,category, BigDecimal.ONE);
    }
    public void setSharedProperty(int customerId,String paymentMethod, String dateOfPurchase, String originOfPurchase){
        setCustomerId(customerId);
        setDateOfPurchase(paymentMethod);
        setPaymentMethod(dateOfPurchase);
        setOriginOfPurchase(originOfPurchase);
    }
}
