package com.sk00sha.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Setter
@Getter
public class Invoice {
    private String invoiceId;
    private String customerId;
    private String itemName;
    private String itemID;
    private String dateOfPurchase;
    private String paymentMethod;
    private String origin;
    private String category;
    private BigDecimal price;

    public Invoice(InvoiceBuilder builder) {
        this.customerId = builder.customerId;
        this.itemName = builder.itemName;
        this.itemID = builder.itemID;
        this.category = builder.category;
        this.dateOfPurchase = builder.dateOfPurchase;
        this.origin = builder.origin;
        this.price = builder.price;
        this.paymentMethod = builder.paymentMethod;
        this.invoiceId=builder.invoiceId;
    }

    public static class InvoiceBuilder{
        private String invoiceId;
        private String customerId;
        private String itemName;
        private String itemID;
        private String category;
        /**
         * -----OPTIONALS----
         */
        private String dateOfPurchase;
        private String paymentMethod;
        private String origin;
        private BigDecimal price;
        public InvoiceBuilder(String id,String customerId, String itemName,String category) {

            this.itemID = id;
            this.customerId = customerId;
            this.itemName = itemName;
            this.category = category;
            this.invoiceId= UUID.randomUUID().toString();

        }

        public InvoiceBuilder addDateOfPurchase(String dateOfPurchase) {
            this.dateOfPurchase = dateOfPurchase;
            return this;
        }

        public InvoiceBuilder addPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public InvoiceBuilder addOrigin(String origin) {
            this.origin = origin;
            return this;
        }

        public InvoiceBuilder addPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Invoice build(){
            return new Invoice(this);
        }

    }

}
