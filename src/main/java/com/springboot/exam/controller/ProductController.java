package com.springboot.exam.controller;

import com.springboot.exam.model.Product;
import com.springboot.exam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/sortProducts")
    public List<Product> sortProducts(@RequestBody List<Product> productList){
        List<Product> productListOutput = productService.sortProducts(productList);
        return productListOutput;
    }

}
