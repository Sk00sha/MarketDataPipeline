package com.sk00sha.generator;

import com.sk00sha.models.Invoice;
import lombok.Setter;


/**
 * Format used is Toaster:1:Kitchen Appliances Name:ID:Category
 */
@Setter
public class InvoiceGenerator implements GenericDataGenerator<Invoice, Invoice.InvoiceBuilder> {
    private int customerId;
    private String paymentMethod;
    private String dateOfPurchase;
    private String originOfPurchase;
    @Override
    public Invoice generateSpecificObject(Invoice.InvoiceBuilder objectToGenerate,int randomPosition) {
        return null;
    }
    public void setSharedProperty(String customerId,String paymentMethod, String dateOfPurchase, String originOfPurchase){
        setCustomerId(Integer.getInteger(customerId));
        setDateOfPurchase(paymentMethod);
        setPaymentMethod(dateOfPurchase);
        setOriginOfPurchase(originOfPurchase);
    }


}
