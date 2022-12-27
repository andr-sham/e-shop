package com.wamazon.wamazonservice.dto;

import java.util.List;

public class Order extends LongIdDto {


    private List<Product> products;


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
