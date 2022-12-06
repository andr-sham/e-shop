package service;

import dto.User;

public interface IUserService<T extends User> {
    boolean register(String login, String password);

    T login(String login, String password);

    T updateUserProfile(T user);


}
