package com.wamazon.wamazonservice;

import com.wamazon.wamazonservice.dto.Product;
import com.wamazon.wamazonservice.repository.SellerRepository;
import com.wamazon.wamazonservice.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.*;
import java.util.List;

@SpringBootApplication
public class WamazonServiceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(WamazonServiceApplication.class, args);

        ProductService productService = (ProductService) run.getBean("productService");

        Product product = new Product();
        product.setId(1);
        product.setName("Книга");

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Футболка");
        product2.setDescription("Красивая футболка");

        productService.save(product);
        productService.save(product2);

        Product product1 = productService.get(1L);
        System.out.println(product1.getName());

        List<Product> products = productService.findByName("Футболка");
        System.out.println(products);


    }


}
