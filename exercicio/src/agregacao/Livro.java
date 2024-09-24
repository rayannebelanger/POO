package agregacao;

public class Livro {
    private String nome;
    private Autor autor;

    public Livro(String nome) { // construtor
        this.nome = nome;
    }

    public void identificarAutor(Autor autor) {
        this.autor = autor;
    }

    public void exibirInfo() {
        System.out.println(this.nome + " foi escrito por " + this.autor.getNome());
    }
}
