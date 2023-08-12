package exercicios.ex1.classes;

public class ContaBancaria {
    // Atributos:
    private double saldo;
    private String titular;

    // Construtor:
    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    // Método de impressão:
    public String toString() {
        return String.format(
            """
            Conta Bancária ====
            Titular: %s
            Saldo: %.2f
            """,
                this.titular, this.saldo
        );
    }

    // Métodos da classe:
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor)
            this.saldo -= valor;
        else
            System.out.println(
                "\u001b[1;31mErro: valor de saque maior do que saldo disponível.\u001b[m"
            );
    }
}
