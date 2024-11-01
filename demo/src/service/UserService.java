package service;

import java.util.ArrayList;

import model.UserModel;
import repository.UserRepository;

public class UserService {
    private UserRepository userRepository; //se vou utilizar outra classe, preciso ter a referencia dela nesta classe

    public UserService(UserRepository userRepository){ //inicializo a classe de userService recebendo o repositorio
        this.userRepository = userRepository;
    }

    public void insertUser(long id, String username, String password, short age){
        if(age>10) {
            UserModel user = new UserModel(id, username, password, age);
            userRepository.save(user);
        }
        
    }

    public void deleteUserById(long id) {
        userRepository.deteleById(id);
    }

    public ArrayList<UserModel> getAllUsers(){
        return userRepository.findAll();
    }

    public UserModel getUserById(long id){
        return userRepository.findById(id);
    }

}
