package com.wamazon.wamazonservice.service;


import com.wamazon.wamazonservice.dto.User;

public abstract class UserService<T extends User> extends CrudService<T> implements IUserService<T>{

}
