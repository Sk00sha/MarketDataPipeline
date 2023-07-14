package com.sk00sha.kafkaStreaming.invoice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
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
