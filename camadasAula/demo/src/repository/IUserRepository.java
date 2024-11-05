package repository;

import java.util.ArrayList;

import model.UserModel;

public interface IUserRepository {

    public void save(UserModel user);
    public ArrayList<UserModel> findAll();
    public UserModel findById(long id);
    public void deleteById(long id);

}
