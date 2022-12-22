package service;

import dto.Order;
import repository.ICrudRepository;

public class OrderService extends CrudService<Order>{

    private ICrudRepository crudRepository;

    public OrderService(ICrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    @Override
    public ICrudRepository<Order> getRepository() {
        return crudRepository;
    }

    @Override
    protected void validate() {

    }
}
