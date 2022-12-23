package com.wamazon.wamazonservice.service;


import com.wamazon.wamazonservice.dto.Product;
import com.wamazon.wamazonservice.repository.ICrudRepository;
import com.wamazon.wamazonservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService extends CrudService<Product> {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ICrudRepository<Product> getRepository() {
        return productRepository;
    }

    @Override
    protected void validate(Product product) {
        if (product.getName() == null){
            throw new RuntimeException("Нельзя сохранять товар без названия");
        }

    }
}
