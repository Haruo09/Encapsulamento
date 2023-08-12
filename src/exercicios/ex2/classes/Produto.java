package exercicios.ex2.classes;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getValorEstoque() {
        return this.preco * this.estoque;
    }
}
