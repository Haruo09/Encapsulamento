package exercicios.ex4.main;

import exercicios.ex4.classes.Circulo;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale para US:
        Locale.setDefault(Locale.US);

        // Criando os objetos:
        Circulo circulo1 = new Circulo(10);
        Circulo circulo2 = new Circulo(5);
        Circulo circulo3 = new Circulo(1);

        // Testando os métodos:
        System.out.println(circulo1);
        System.out.println(circulo2);
        System.out.println(circulo3);

        /*
        * Como o método toString() da classe Círculo já utiliza os métodos
        * getArea() e getPerimetro(), não se vê necessário chamá-los na classe
        * Main para testá-los, basta verificar se as informações mostradas no
        * toString() estão corretas.
        * */
    }
}
