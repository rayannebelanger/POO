package aulacinco;
public class App {
    public static void main(String[] args) throws Exception {
        
        Produto p1 = new Produto("Garrafa");
        //p1.nome = "Garrafa";
        p1.apresentar(); //Chamo o método na Main
        //acessamos indiretamente o atibuto "nome" por intermedio do método "apresentar"
    }
}
