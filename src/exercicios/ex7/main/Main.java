package exercicios.ex7.main;

import exercicios.ex7.classes.Retangulo;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando o objeto:
        Retangulo retangulo = new Retangulo(4.5, 9.0);

        // Testando os métodos .getArea() e .getPerimetro() e mostrando as informações do objeto:
        System.out.println(retangulo);
    }
}
