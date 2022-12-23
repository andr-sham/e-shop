package com.wamazon.wamazonservice;

import com.wamazon.wamazonservice.dto.Product;
import com.wamazon.wamazonservice.repository.ProductRepository;
import com.wamazon.wamazonservice.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WamazonServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WamazonServiceApplication.class, args);


        ProductRepository productRepository = new ProductRepository();
        ProductService productService = new ProductService(productRepository);

        Product product = new Product();
        product.setId(1);
		product.setName("Книга");

		productService.save(product);

        Product product1 = productService.get(1L);
        System.out.println(product1.getName());



    }


}
