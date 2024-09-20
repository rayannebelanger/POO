package package1;

public class Autor {
    private String nome;

    public Autor(String nome) { //parametro - inicializacao
        this.nome = nome; //inicializando nome
    }

    public String getNome(){
        return this.nome;
    }
}
