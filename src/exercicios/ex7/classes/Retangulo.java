package exercicios.ex7.classes;

public class Retangulo {
    // Atributos:
    private double altura;
    private double largura;

    // Construtor:
    public Retangulo(double altura, double largura) {
        // Math.abs() utilizado para tratar valores negativos.
        this.altura = Math.abs(altura);
        this.largura = Math.abs(largura);
    }

    // Método toString():
    public String toString() {
        return String.format(
            """
            Retângulo ========
            Altura: %.2f
            Largura: %.2f
            Área: %.2f
            Perímetro: %.2f
            """,
            this.altura, this.largura, this.getArea(), this.getPerimetro()
        );
    }

    // Métodos públicos:
    public double getArea() {
        return this.altura * this.largura;
    }

    public double getPerimetro() {
        return 2 * this.altura + 2 * this.largura;
    }
}
