package com.springboot.exam.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Availability {
    private String storeNo;
    private String productId;
    private String date;
    private double avialQty;
}
