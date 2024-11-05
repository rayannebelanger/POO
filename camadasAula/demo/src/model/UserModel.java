package model;

public class UserModel {

    private long id;
    private String username;
    private String password;
    private short age;

    public UserModel(long id, String username,
                    String password, short age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return id + " - " + username;
    }
    
}
