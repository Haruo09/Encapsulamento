package exercicios.ex2.main;

import exercicios.ex2.classes.Produto;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale para US:
        Locale.setDefault(Locale.US);

        // Instanciando os objetos:
        Produto celular = new Produto("Celular", 10_000_000, 10);
        Produto fone = new Produto("Fone de Ouvido", 1_200_000, 15);
        // produtos feitos de diamante, só pode kkkkkkkkkkkkkkkk

        // Imprimindo as informações "de fábrica":
        System.out.println(celular);
        System.out.println(fone);

        // Testando o método getValorEstoque():
        System.out.printf("%,.2f%n", celular.getValorEstoque());  // 100,000,000.00
        System.out.printf("%,.2f%n", fone.getValorEstoque());  // 18,000,000.00
    }
}
