import model.UserModel;
import repository.UserRepository;
import repository.IUserRepository;
import service.UserService;

public class App {
    public static void main(String[] args) throws Exception { //throws exception é uma classe 
        
        IUserRepository userRepository = new UserRepository();  // o new UserRepository é onde está os meus dados armazenados (no arraylist)
        UserService userService = new UserService(userRepository);

        try { //tentar inserir o usuário
            userService.insertUser(1, "filipeboladao", 
            "filipe123", (short) 5);
        } catch (Exception e){ //se não der certo, pega a exceção e mostrar essa msg | só entra aqui se uma exceção for capturada
            System.out.println("It was not possible to insert this user in the system, becase his/her age is lower than 10");
        } //exception e é uma instancia da classe exception
        
        UserModel user = userService.getUserById(1);

        System.out.println(user);

    }
}
