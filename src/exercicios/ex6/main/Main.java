package exercicios.ex6.main;

import exercicios.ex6.classes.Livro;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando os objetos:
        Livro livro1 = new Livro(
            "O Pequeno Príncipe",
            "Antoine de Saint-Exupéry",
            93
        );
        Livro livro2 = new Livro(
            "Uma Conjuração de Luz",
            "V.E. SCHWAB",
            746
        );
        Livro livro3 = new Livro(
            "O canto mais escuro da floresta",
            "HOLLY BLACK",
            293
        );

        // Testando o método verificarGrandeza():
        System.out.printf(
            """
            %sÉ grande? %s%n
            """,
            livro1,
            (livro1.verificarGrandeza())?"sim":"não"  // operador ternário
        );

        System.out.printf(
            """
            %sÉ grande? %s%n
            """,
            livro2,
            (livro2.verificarGrandeza())?"sim":"não"  //operador ternário
        );

        System.out.printf(
            """
            %sÉ grande? %s%n
            """,
            livro3,
            (livro3.verificarGrandeza())?"sim":"não"  // operador ternário
        );
    }
}
