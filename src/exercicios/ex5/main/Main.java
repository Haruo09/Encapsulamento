package exercicios.ex5.main;

import exercicios.ex5.classes.Carro;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando os objetos:
        Carro carro1 = new Carro("Uno", "Fiat", 2004);
        Carro carro2 = new Carro("Fit", "Honda", 2004);

        // Exibindo as informações dos objetos:
        System.out.println(carro1);
        System.out.println(carro2);
    }
}
