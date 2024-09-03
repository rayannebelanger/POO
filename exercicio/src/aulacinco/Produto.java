package aulacinco;
public class Produto {
    
    private String nome;
    
    public Produto(String nome) {
        this.nome = nome;
    }

public void apresentar() { //Isso é um método, em que consigo utilizar o atributo privado, QUE SÓ PODE USAR NA MSM CLASSE POR SER PRIVATE
    System.out.println("O nome do produto é " + this.nome);
}
}