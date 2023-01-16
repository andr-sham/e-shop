package com.wamazon.wamazonservice.controller;

import com.wamazon.wamazonservice.dto.LongIdDto;
import com.wamazon.wamazonservice.dto.Product;
import com.wamazon.wamazonservice.service.ICrudService;
import org.springframework.web.bind.annotation.*;

public abstract class CrudController<T extends LongIdDto> {
    public abstract ICrudService<T> getService();
    @GetMapping("/{id}")
    public T get(@PathVariable Long id) {
        return getService().get(id);
    }

    @PostMapping
    public T save(@RequestBody T dtoToSave) {
        return getService().save(dtoToSave);
    }

    @PutMapping
    public T update(@RequestBody T dtoToUpdate) {
        return getService().update(dtoToUpdate);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        getService().delete(id);
    }
}
