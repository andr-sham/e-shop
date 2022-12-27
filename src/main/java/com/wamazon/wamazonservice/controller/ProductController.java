package com.wamazon.wamazonservice.controller;

import com.wamazon.wamazonservice.dto.Product;
import com.wamazon.wamazonservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/search/findByName")
    public List<Product> findByName(@RequestParam String name) {
        return productService.findByName(name);
    }

    @GetMapping("/{id}")   //todo только один параметр на входе?
    public Product get(@PathVariable Long id) {
        return productService.get(id);
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }


}
