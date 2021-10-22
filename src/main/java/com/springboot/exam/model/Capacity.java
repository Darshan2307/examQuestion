package com.springboot.exam.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Capacity {
    private String storeNo;
    private String productId;
    private String date;
    private double noOfOrdersAccepted;
}
