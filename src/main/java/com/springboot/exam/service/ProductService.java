package com.springboot.exam.service;

import com.springboot.exam.model.Product;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    public List<Product> sortProducts(List<Product> productList) {
        List<Product> sortedList = productList.stream().sorted(Comparator.comparing(Product::getProductId)
                .thenComparing(Product::getLaunchDate).reversed())
                .collect(Collectors.toList());
        return sortedList;
    }
}
