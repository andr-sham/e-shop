package com.wamazon.wamazonservice.service;


import com.wamazon.wamazonservice.dto.LongIdDto;
import com.wamazon.wamazonservice.repository.ICrudRepository;

public abstract class CrudService<T extends LongIdDto> implements ICrudService<T> {

    public abstract ICrudRepository<T> getRepository();

    protected abstract void validate(T dto);
    @Override
    public T save(T dtoToSave) {
        validate(dtoToSave);
        return getRepository().save(dtoToSave);
    }



    @Override
    public T get(Long id) {
        return getRepository().findOne(id);
    }

    @Override
    public T update(T dtoToUpdate) {
        validate(dtoToUpdate);
        return getRepository().update(dtoToUpdate);
    }

    @Override
    public void delete(Long id) {
        getRepository().delete(id);
    }
}
