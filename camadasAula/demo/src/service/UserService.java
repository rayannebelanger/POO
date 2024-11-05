package service;

import java.util.ArrayList;

import model.UserModel;
import repository.IUserRepository;

public class UserService {

    private IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void insertUser(long id, String username,
            String password, short age) throws Exception {
        if (age > 10) {
            UserModel user = new UserModel(id, username, password, age);
            userRepository.save(user);
        } else {
            throw new Exception("User not allowed");
        }

    }

    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }

    public ArrayList<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    public UserModel getUserById(long id) {
        return userRepository.findById(id);
    }

}
