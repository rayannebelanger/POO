import model.UserModel;
import repository.UserRepository;
import service.UserService;

public class App {
    public static void main(String[] args) throws Exception {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository); //userService vai manipular o userRepository

        userService.insertUser(1, "ray", "rayassssss", (short) 21);
        UserModel user = userService.getUserById(1);

        System.out.println(user);


    }
}
