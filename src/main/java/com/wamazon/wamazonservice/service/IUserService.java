package com.wamazon.wamazonservice.service;


import com.wamazon.wamazonservice.dto.RegistrationDto;
import com.wamazon.wamazonservice.dto.User;

public interface IUserService<T extends User> extends ICrudService<T> {
    boolean register(RegistrationDto registrationDto);

    T login(String login, String password);


}
