package com.wamazon.wamazonservice.controller;

import com.wamazon.wamazonservice.dto.Product;
import com.wamazon.wamazonservice.service.ICrudService;
import com.wamazon.wamazonservice.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController extends CrudController<Product>{
    @Autowired
    private IProductService productService;

    @GetMapping("/search/findByName")
    public List<Product> findByName(@RequestParam String name) {
        return productService.findByName(name);
    }


    @Override
    public ICrudService getService() {
        return productService;
    }
}
