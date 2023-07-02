package Pessoas;


public class Pessoa {
    // Atributos
    public String nome;
    public String situacaoPessoa;

    
    // métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    public String getSituacaoPessoa() {
        return situacaoPessoa;
    }

    public void setSituacaoPessoa(String situacaoPessoa) {
        this.situacaoPessoa = situacaoPessoa;
    }

    // método toString
    @Override
    public String toString(){
        return "pessoa [nome="+nome+", situação da pessoa = "+situacaoPessoa+"]";
    }

    
    
}