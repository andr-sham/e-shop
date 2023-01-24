package com.wamazon.wamazonservice.repository;


import com.wamazon.wamazonservice.dto.LongIdDto;
import com.wamazon.wamazonservice.dto.Product;
import com.wamazon.wamazonservice.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public abstract class CrudRepository<T extends LongIdDto> implements ICrudRepository<T> {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private ProductMapper productMapper;
    List<T> database = new ArrayList<>();

    private long idSequence;


    @Override
    public T save(T dtoToSave) {
        dtoToSave.setId(++idSequence);
        database.add(dtoToSave);
        return dtoToSave;
    }

    @Override
    public T findOne(Long id) {
        String sql = "SELECT id, name,description FROM product WHERE id = 1";
        List<Product> result = jdbcTemplate.query(sql, productMapper);
        System.out.println(result);
        return null;
    }

    @Override
    public T update(T dtoToUpdate) {
        database.remove(dtoToUpdate);
        database.add(dtoToUpdate);
        return dtoToUpdate;
    }

    @Override
    public void delete(Long id) {

        database.removeIf(next -> next.getId().equals(id));
    }
}
