package com.springboot.exam.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ProductList {
    private List<Product> productList;
}
