package Pessoas;

public class Juridica extends Pessoa {
    // Atributos
    public String cnpj;
    public String inscricaoEstadual;




    
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;



    }


    // método toString
    @Override
    public String toString() {
        return "Juridica [nome="+nome+", situação da pessoa = "+situacaoPessoa+"cnpj=" + cnpj + ", inscricaoEstadual=" + inscricaoEstadual + "]";
    }

    // método toString
    
    

    
    
}
