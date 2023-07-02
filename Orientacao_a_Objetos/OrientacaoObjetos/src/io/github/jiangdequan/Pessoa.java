package io.github.jiangdequan;

public class Pessoa {
    /*
     *  ENCAPSULAMENTO => você blinda as classes seus métodos e atributos
     *  para que as outras classes não tenha acesso a elas.
     * 
     *  Tem que colocar os atributos em privado, protect:
     *  Exemplo:
     *  private String nome; 
     * 
     *  Agora para ter acesso aos atributos, terá que criar os métodos:
     *  getters e setters, usando eles você terá acesso aos atributos.
     * 
     *  Na classe Principal, para adicionar algo terá que fazer assim:
     *  -> pes.setNomePessoa("Giovani"); 
     *  
     *  Para pegar, vê o que está dentro da variável, é assim:
     *  -> pes.getNomePessoa();
     * 
     */

    // atributos -> variáveis
    private String nomePessoa;
    private int idadePessoa;
    protected String cidadePessoa;

    // criar um método que vai exibir algo
    public void mostrarDados(String nome, int idade){

        System.out.println("Exibindo o nome: "+nome);
        System.out.println("Exibindo a idade: "+idade);

    }
    
    

    /**
     *  métodos de acesso -> getters e setters
     *      set -> usado quando você quer Adicionar um valor para a variável 
     *      get -> usado quando você quer Pegar o que está dentro da variável
     */
    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    
    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

}