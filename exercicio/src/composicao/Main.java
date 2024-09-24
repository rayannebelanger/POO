package composicao;

public class Main {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("Perdida");
        //para autor existir, precisa do livro!! isso é composição
        livro1.identificarAutor("jkr");
        livro1.exibirInfo();

    }
}
