package repository;

import dto.User;

public interface IUserRepository {

    public User getUserByLogin(String login);

    public User saveUsers(String login, String password);

}
