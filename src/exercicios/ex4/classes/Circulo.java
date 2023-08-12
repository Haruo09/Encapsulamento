package exercicios.ex4.classes;

public class Circulo {
    // Atributos:
    private double raio;

    // Construtor:
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método toString():
    public String toString() {
        return String.format(
            """
            Círculo =====
            Raio: %.2f
            Área: %.2f
            Perímetro: %.2f
            """,
            this.raio, this.getArea(), this.getPerimetro()
        );
    }

    // Métodos públicos da classe:
    public double getArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double getPerimetro() {
        // O uso do "this" aqui não é estritamente necessário, mas colocamos por capricho.
        return 2 * Math.PI * this.raio;
    }
}
