package exercicios.ex6.classes;

public class Livro {
    // Atributos:
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    // Construtor:
    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    // toString():
    public String toString() {
        return String.format(
            """
            Livro =================
            Título: %s
            Autor: %s
            Número de Páginas: %d
            """,
            this.titulo, this.autor, this.numeroDePaginas
        );
    }

    // Métodos públicos:
    public boolean verificarGrandeza() {
        return this.numeroDePaginas > 300;
    }

    // Getters:
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }
}
