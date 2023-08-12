package exercicios.ex3.classes;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public boolean verificarMaioridade() {
        /* Utilizando if-else:
        * if (this.idade >= 18) {
        *   return true
        * }
        * else {
        *   return false
        * }
        * */

        /* Utilizando Operador Ternário:
        * return (this.idade >= 18)?true:false;
        * */

        // Simplificando ao máximo:
        return this.idade >= 18;

        /*
        * Como "this.idade ≥ 18" é uma expressão de comparação,
        * ela automaticamente retorna um valor booleano. Portanto, qualquer
        * if-else é desnecessário nesse caso.
        * */
    }

    public String toString() {
        return String.format(
            """
            Pessoa ==============
            Nome: %s
            Idade: %d
            CPF: %s
            """,
            this.nome, this.idade, this.cpf
        );
    }

    /*
    * O enunciado pediu para implementar métodos públicos para exibir as
    * informações da pessoa, portanto os métodos getters foram criados.
    * Apenas o "toString()" seria o suficiente para suprir a demanda
    * do enunciado, mas criamos os getters por capricho.
    * */

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }
}
