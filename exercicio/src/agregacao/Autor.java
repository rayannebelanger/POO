package agregacao;

public class Autor {
    private String nome;
    public Autor(String nome) { //construtor
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
