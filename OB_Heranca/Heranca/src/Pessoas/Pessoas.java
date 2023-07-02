package Pessoas;
public class Pessoas {
    public static void main(String[] args) throws Exception {
        /* Herança é quando você herda algo de alguém.
         * 
         * Nas classes que irão herdar algo coloque -> extends 
         * essa classe, será uma extensão da classe Pai.
         * 
         * Como esse exemplo onde o atributo nome e situaçãoPessoa, está somente na classe -> Pessoa
         * Mas as outras classes teram esses atributos, sem precisar colocar eles nas classes.
         * 
         */
        // instanciando um objeto pessoa
        Pessoa pe = new Pessoa();

        pe.nome = "Giovani";
        pe.situacaoPessoa = "Estudando";
        
        
System.out.println("================================ Dados Pessoa =============================\n");

        System.out.println(pe.toString());

System.out.println("===========================================================================\n");

        // instanciando um objeto fisica
        Fisica fi = new Fisica();

        fi.nome = "Guilherme";
        fi.situacaoPessoa = "Dormindo";
        fi.cpf = "2544545645";
        fi.identidade = "12.3256.584";
        
        System.out.println("========================= Dados Pessoa Fisica =====================\n");

        System.out.println(fi.toString());

System.out.println("===========================================================================\n");


        // instanciando um objeto fisica
        Juridica ju = new Juridica();

        ju.nome = "Getúlio";
        ju.situacaoPessoa = "Passeando";
        ju.cnpj = "789.235.6589";
        ju.inscricaoEstadual = "254.156.456.789";
        
        System.out.println("======================== Dados Pessoa Juridica =====================\n");

        System.out.println(ju.toString());

System.out.println("============================================================================\n");









    }
}
