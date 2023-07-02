package io.github.jiangdequan;
public class Conceito_Classe {
    public static void main(String[] args) throws Exception {
        // CLASSE -> expressa em variáveis o que tem no mundo real
        // dentro da Classe terá métodos, variáveis, etc...
        // quando se cria um projeto a primeira classe normalmente é a classe Principal
        // é pela Classe Principal que se chama, aciona as outras classes

        // instânciando a classe Pessoa -> vira um objeto
        Pessoa pes = new Pessoa();

        // Adicionando os valores nas variáveis
        // vai salvar na variável que está na classe Pessoa, esses dados.
        pes.setNomePessoa("Giovani"); 
        pes.setIdadePessoa(38);
        
        // aciona o método que está na classe Pessoa
        // e seta esses valores neste método, que precisa receber esses parâmetros
        pes.mostrarDados(pes.getNomePessoa(), pes.getIdadePessoa());
    }
}
