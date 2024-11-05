package repository;

import java.util.ArrayList;

import model.UserModel;

public class UserRepository implements IUserRepository {

    private ArrayList<UserModel> users; //ao inves de usar um arraylist teria que usar uma instancia do banco de dados
    //o arraylist é só pra exemplicar o banco de dados aqui

    public UserRepository() {
        users = new ArrayList<>();
    }

    public void save(UserModel user){
        users.add(user);
    }

    public ArrayList<UserModel> findAll(){
        return users;
    }

    public UserModel findById(long id){
        for (int i=0; i<users.size(); i++){
            if(users.get(i).getId()==id){
                return users.get(i);
            }
        }

        return null;
    }

    public void deleteById(long id){
        UserModel user = findById(id);

        if(user != null){
            users.remove(user);
        }
    }


    
}
