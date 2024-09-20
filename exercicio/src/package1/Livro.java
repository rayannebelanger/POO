package package1;

public class Livro {
    private String nome;

    public Livro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void relacionarLivroAutor(Autor autor) {
        System.out.println("O livro " + this.nome + " possui " + autor.getNome());
    }
}
