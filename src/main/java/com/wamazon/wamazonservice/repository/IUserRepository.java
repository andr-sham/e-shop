package com.wamazon.wamazonservice.repository;


import com.wamazon.wamazonservice.dto.User;

public interface IUserRepository<T extends User> extends ICrudRepository<T>{

    T findUserByLogin(String login);


}
