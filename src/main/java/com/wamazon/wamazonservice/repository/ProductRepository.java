package com.wamazon.wamazonservice.repository;


import com.wamazon.wamazonservice.dto.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository extends CrudRepository<Product> {

    public List<Product> findByName(String name) {
         List<Product>result = new ArrayList<>();
        for (Product product : database) {
            if (product.getName().equals(name)){
                result.add(product);
            }
        }
        return result;
    }
}
