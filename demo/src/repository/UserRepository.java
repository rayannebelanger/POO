package repository;

import java.util.ArrayList;

import model.UserModel;

public class UserRepository {
    private ArrayList<UserModel> users;

    public UserRepository() {
        users = new ArrayList<>();
    }

    public void save(UserModel user) {
        users.add(user);
    }

    public ArrayList<UserModel> findAll(){ //retorna todos os usuários do arraylist
        return users;
    }

    public UserModel findById(long id) { //tipo UserModel pq vai retornar o id do Usuário que tá no Usermodel
        for(int i = 0; i < users.size(); i++) {
            if(users.get(i).getId() == id) {
                return users.get(i);
            } 
        }

        return null; //para caso de não ter o user que quer encontrar, retorna null(nada)
    }

    public void deteleById(long id) { //void pq não vai retornar nada, nem usuário, só vai deletar
        UserModel user = findById(id);
        if(user != null) {
            users.remove(user);
        } //cada método tem o principio de fazer somente uma responsabilidade! por isso não é legal colocar o print
            //não é responsabilidade dele mostrar a msg que não tem!
        
    }

}
