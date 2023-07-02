package Pessoas;

public class Fisica extends Pessoa {
    // Atributos
    public String cpf;
    public String identidade;


    //métodos de acesso
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getIdentidade() {
        return identidade;
    }
    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    // método toString
    @Override
    public String toString() {
        return "Fisica [nome="+nome+", situação da pessoa = "+situacaoPessoa+", identidade=" + identidade + ", cpf=" + cpf + "]";
    }

    
    
}
