package exercicios.ex5.classes;

public class Carro {
    // Atributos:
    private String marca;
    private String modelo;
    private int ano;

    // Construtor:

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método toString():
    public String toString() {
        return String.format(
            """
            Carro ==============
            Marca: %s
            Modelo: %s
            Ano: %d
            """,
            getMarca(), getModelo(), getAno()
        );
    }

    // Métodos getters:
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}
