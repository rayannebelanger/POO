package agregacao;
//agrecação!!! - coexistem independente da relação
public class Main {
    public static void main(String[] args) {
        
        Autor autor1 = new Autor("Carina Rissi");
        Livro livro1 = new Livro("Perdida");

        livro1.identificarAutor(autor1);
        livro1.exibirInfo();

    }
}
