package service;

import dto.Good;
import repository.ICrudRepository;

public class GoodService extends CrudService<Good> {

    private ICrudRepository crudRepository;

    public GoodService(ICrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    @Override
    public ICrudRepository<Good> getRepository() {
        return crudRepository;
    }

    @Override
    protected void validate() {

    }
}
