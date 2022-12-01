package repository;

import dto.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserRepository implements IUserRepository {


    private List<User> userDatabase = new ArrayList<>();


    @Override
    public User getUserByLogin(String login) {
        for (User user : userDatabase) {
            if (user != null && user.getLogin().equalsIgnoreCase(login)) {
                return user;
            }
        }

        return null;
    }

    @Override
    public User saveUsers(String login, String password) {
        User user = new User();
        user.setId(userDatabase.size() + 1);
        user.setLogin(login);
        user.setPassword(password);

        userDatabase.add(user);

        return user;
    }

    @Override
    public User updateUser(User userToUpdate) {

        userDatabase.remove(userToUpdate);

        userDatabase.add(userToUpdate);

        return userToUpdate;
    }
}
