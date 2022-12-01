package repository;

import dto.User;

public interface IUserRepository {

    User getUserByLogin(String login);

    User saveUsers(String login, String password);

    User updateUser(User userToUpdate);

}
