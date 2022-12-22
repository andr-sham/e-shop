package service;

import dto.LongIdDto;
import repository.ICrudRepository;

public abstract class CrudService<T extends LongIdDto> implements ICrudService<T> {

    public abstract ICrudRepository<T> getRepository();

    protected abstract void validate();
    @Override
    public T save(T dtoToSave) {
        validate();
        return getRepository().save(dtoToSave);
    }



    @Override
    public T get(Long id) {
        return getRepository().get(id);
    }

    @Override
    public T update(T dtoToUpdate) {
        validate();
        return getRepository().update(dtoToUpdate);
    }

    @Override
    public void delete(Long id) {
        getRepository().delete(id);
    }
}
