package exercicios.ex8.main;

import exercicios.ex8.classes.Aluno;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando os objetos:
        Aluno haruo = new Aluno(
            "Fábio Haruo",
            16,
            4.8
        );

        Aluno duda = new Aluno(
            "Maria Eduarda",
            17,
            10
        );

        // Imprimindo as informações de ambos os alunos:
        System.out.println(haruo);
        System.out.println(duda);

        // Imprimindo as suas aprovações:
        System.out.printf("Haruo: %s%n", (haruo.verificarAprovacao())?"aprovado":"reprovado");
        System.out.printf("Duda: %s%n", (duda.verificarAprovacao())?"aprovada":"reprovada");
    }
}
