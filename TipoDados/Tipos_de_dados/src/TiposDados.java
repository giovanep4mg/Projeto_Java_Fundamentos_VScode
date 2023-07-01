public class TiposDados {
    public static void main(String[] args) throws Exception {
        /*
            Tipo de de dados (mais usados):
            String, Double, Float, int, char.

            * Exemplo de como usar o String que é um tipo de dado:
            ->> String nome = "Giovani";

            => String -> é o tipo de dados, que recebe palavras,textos.
            => nome -> é uma variável que guardará um texto, palavra...
            => "Boa noite, jovem aprendiz." -> é o que vai está dentro da variável.

        */ 

        /*
            Variáveis são usadas para guarda dados, cada uma guarda o tipo de dados.
            Elas ocupam memoria do computador, então tenha cuidado ao usar,
            mas somente durante o uso do programa, depois irá sumir

        */ 
        /*
            Literais => é o sinal ( = ), que quer dizer que tal variável irá receber certo valor.
            Exemplo:
            String nome = 'Giovani';

        */ 

        // cria o tipo, a variável e passa os valor para dentro dela.

        String nome = "Boa noite, jovem aprendiz.";// recebe textos e palavras.
        Double salario = 1234.45; //recebe valores decimais longo.
        Float gastoDia = 123.35f; //recebe valores decimais curtos -> deve colocar o "f" no final.
        int numeroCasa = 89; //recebe valores de números inteiros
        char caractere = 'S'; //recebe somente uma letra, um caractere

        // Exibe os valores dentro das variáveis
        System.out.println("============================Tipos de Dados ===========================");
        System.out.println("Valor dentro da variável nome é: "+nome);
        System.out.println("Valor dentro da variável salário é: "+salario);
        System.out.println("Valor dentro da variável gastoDia é: "+gastoDia);
        System.out.println("Valor dentro da variável numeroCasa é: "+numeroCasa);
        System.out.println("Valor dentro da variável caractere é: "+caractere);

    }
}
