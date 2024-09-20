package package1;

public class Main {
    public static void main(String[] args) {
        
        Autor autor = new Autor("Rayanne");
        Livro livro = new Livro("Trono de vidro");

        livro.relacionarLivroAutor(autor);
    }
}
