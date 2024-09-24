package composicao;

public class Livro {
    private String nome;
    private Autor autor;

    public Livro(String nome) { // construtor
        this.nome = nome;
    }

    public void identificarAutor(String nome) {
        this.autor = new Autor(nome);
    }

    public void exibirInfo() {
        System.out.println(this.nome + " foi escrito por " + this.autor.getNome());
    }
}
