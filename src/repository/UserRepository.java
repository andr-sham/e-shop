package repository;

import dto.User;

public class UserRepository implements IUserRepository {


    private User[] userDatabase = new User[10];
    private int counter = 1;


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
        user.setId(counter);
        user.setLogin(login);
        user.setPassword(password);


        userDatabase[counter - 1] = user;
        counter++;
        return user;
    }
}
