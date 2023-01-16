package com.wamazon.wamazonservice.repository;


import com.wamazon.wamazonservice.dto.User;

public abstract class UserRepository<T extends User> extends CrudRepository<T> implements IUserRepository<T>{
@Override
    public T findUserByLogin(String searchLogin) {
        for (T user : database) {
            if (user.getLogin().equalsIgnoreCase(searchLogin)) {
                return user;
            }
        }
        return null;
    }
}
