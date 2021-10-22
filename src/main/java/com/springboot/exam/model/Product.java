package com.springboot.exam.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String productId;
    private String productName;
    private String unitOfMeasure;
    private String launchDate;
}
