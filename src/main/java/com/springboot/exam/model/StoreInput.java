package com.springboot.exam.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StoreInput {
    private String storeNo;
    private String productId;
    private double reqQty;
    private String reqDate;
}
