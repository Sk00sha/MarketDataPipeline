package com.sk00sha.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
@Setter
@Getter
@AllArgsConstructor
public class Invoice {
    private String invoiceId;
    private int customerId;
    private int quantity;
    private int itemID;
    private String dateOfPurchase;
    private String paymentMethod;
    private PurchaseOrigin origin;
    private String category;
    private BigDecimal price;
}
