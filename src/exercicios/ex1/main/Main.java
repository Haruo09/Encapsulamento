package exercicios.ex1.main;

import exercicios.ex1.classes.ContaBancaria;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale para US, consequentemente mudando o floating point para "."
        Locale.setDefault(Locale.US);

        // Criando dois objetos a partir da classe "ContaBancaria":
        ContaBancaria contaHaruo = new ContaBancaria(1200, "Haruo");
        ContaBancaria contaDuda = new ContaBancaria(1200, "Duda");

        // Imprimindo as informações "de fábrica" desses objetos:
        System.out.println(contaDuda);
        System.out.println(contaHaruo);

        System.out.println("===================");  // Separação;

        // Testando o método ".depositar()":
        System.out.println("\u001b[1;34mDepósito: valor R$300.00\u001b[m");
        contaHaruo.depositar(300);
        // Imprimindo as informações da conta, verificando se o método agiu corretamente:
        System.out.println(contaHaruo);

        // Testando o método ".saque()":
        System.out.println("\u001B[1;34mSaque: Valor R$1500.00\u001B[m");
        contaHaruo.sacar(1500);

        // Imprimindo as informações da conta, verificando se o método agiu corretamente:
        System.out.println(contaHaruo);

        System.out.println("===================");

        // Repetindo o teste do método ".depositar()":
        System.out.println("\u001b[1;34mDepósito: valor R$500.00\u001b[m");
        contaDuda.depositar(500);

        // Imprimindo as informações da conta, verificando se o método agiu corretamente:
        System.out.println(contaDuda);

        // Repetindo o teste do método ".saque()":
        System.out.println("\u001b[1;34mSaque: Valor R$2000.00\u001b[m");
        contaDuda.sacar(2000);

        // Imprimindo as informações da conta, verificando se o método agiu corretamente:
        System.out.println(contaDuda);  // Output: Erro...

        /*
        * Como o valor de saque foi maior que o saldo da conta (ou seja,
        * do atributo "saldo" do objeto "contaDuda", o método imprimiu uma mensagem
        * de erro, e não realizou nenhuma operação.
        * */
    }
}
