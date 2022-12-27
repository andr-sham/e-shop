package com.wamazon.wamazonservice.service;


import com.wamazon.wamazonservice.dto.Product;
import com.wamazon.wamazonservice.repository.ICrudRepository;
import com.wamazon.wamazonservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService extends CrudService<Product> {

    @Autowired
    private ProductRepository productRepository;


    private String test;


    @Override
    public ICrudRepository<Product> getRepository() {
        return productRepository;
    }

    @Override
    protected void validate(Product product) {
        if (product.getName() == null) {
            throw new RuntimeException("Нельзя сохранять товар без названия");
        }

    }


    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }
}
