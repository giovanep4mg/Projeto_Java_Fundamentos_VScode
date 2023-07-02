package Pessoas;


public class Pessoa {
    // Atributos
    public String nome;
    public String situacaoPessoa;

    @Override
    public String toString(){
        return "pessoa [nome="+nome+", situação da pessoa = "+situacaoPessoa+"]";
    }

    
    
}