package com.wamazon.wamazonservice.repository;



import com.wamazon.wamazonservice.dto.LongIdDto;

import java.util.ArrayList;
import java.util.List;

public class CrudRepository<T extends LongIdDto> implements ICrudRepository<T> {


    List<T> database= new ArrayList<>();



    @Override
    public T save(T dtoToSave) {
        database.add(dtoToSave);
        return dtoToSave;
    }

    @Override
    public T findOne(Long id) {
        for (T dto : database) {
            if (dto.getId() == id) {
                return dto;
            }
        }
        throw new RuntimeException("Объект с id " + id + " не был найден");
    }

    @Override
    public T update(T dtoToUpdate) {
        database.remove(dtoToUpdate);
        database.add(dtoToUpdate);
        return dtoToUpdate;
    }

    @Override
    public void delete(Long id) {

        database.removeIf(next -> next.getId() == id);
    }
}
