package exercicios.ex3.main;

import exercicios.ex3.classes.Pessoa;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando os objetos:
        Pessoa haruo = new Pessoa("Fábio Haruo", 16, "40976037874");
        Pessoa duda = new Pessoa("Maria Eduarda", 17, "13948924627");

        // Exibindo as informações de ambas as pessoas:
        System.out.println(haruo);
        System.out.println(duda);
    }
}
