package exercicios.ex8.classes;

public class Aluno {
    // Atributos:
    private String nome;
    private int idade;
    private double mediaNotas;

    // Construtor:
    public Aluno(String nome, int idade, double mediaNotas) {
        this.nome = nome;
        this.idade = idade;
        this.mediaNotas = mediaNotas;
    }

    // toString():
    public String toString() {
        return String.format(
            """
            Aluno ============
            Nome: %s
            Idade: %d
            Média das notas: %.2f
            """,
            this.nome, this.idade, this.mediaNotas
        );
    }

    // Métodos públicos:
    public boolean verificarAprovacao() {
        return this.mediaNotas >= 6;
    }

    // Getters:
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getMediaNotas() {
        return mediaNotas;
    }
}
