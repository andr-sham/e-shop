package com.wamazon.wamazonservice.repository;


import com.wamazon.wamazonservice.dto.User;

public interface IUserRepository<T extends User> {

    T getUserByLogin(String login);

    T saveUsers(String login, String password);

    T updateUser(T userToUpdate);

}
