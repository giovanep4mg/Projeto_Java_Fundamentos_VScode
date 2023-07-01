import java.util.Scanner;

public class Scanner_PegarDados {
    public static void main(String[] args) throws Exception {
        // Entrada de dados -> como pegar os dados do usuário
        // USANDO O SCANNER

        
            // instancializar a classe para pegar os dados
            Scanner ler = new Scanner(System.in);
            // variável que irá guarda o nome
            String nome;

System.out.println("========================= Pegando TEXTO ==============================\n");            
            
            // pede ao usuário para digitar o seu nome.
            System.out.println("Digite seu nome: ");

            // salva o valor digitado, na variável nome.
            nome = ler.nextLine();

System.out.println("==================== Pegando NÚMEROS INTEIROS ========================\n");
            
            // para pegar um número INTEIRO
            System.out.println("Digite sua idade: ");

            // salva o valor digitado, na variável nome.
            int idade = ler.nextInt();

System.out.println("==================== Pegando NÚMEROS DECIMAIS ========================\n");

        // para pegar um número Decimal
        System.out.println("Digite seu peso, use a vírgula para separar os valores: ");

        // salva o valor digitado, na variável nome.
        Double peso = ler.nextDouble();

System.out.println("============================ RESULTADOS ============================\n");

        // exibi o nome digitado
        System.out.println("O nome digitado foi: "+nome);

        // exibi a idade digitado
        System.out.println("A idade digitado foi: "+idade);

        // exibi o peso digitado
        System.out.println("O peso digitado foi: "+peso);

System.out.println("=============================== fim ================================\n");

            
            //fechar o Scanner
            ler.close();
        
        }



    
}
