import repository.UserRepository;
import service.UserService;

public class Main {

    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        userService.register("best_ever_user", "1234567");



    }
}
