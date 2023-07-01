public class WHILE {
    public static void main(String[] args) throws Exception {
        // Laços de repetição, são usadas para fazer várias vezes uma ação.
        // WHILE -> enquanto 

        // variável 
        int quantasVezes = 1;

        // enquanto, o valor da variável  for menor ou igual a 10
        while(quantasVezes <= 10){

            // vai exibir essa mensagem, mostrando o valor da variável
            System.out.println("Estou fazendo a "+quantasVezes+" vezes.");

            // acrescenta mais 1 a cada repetição, assim fará a repetição parar, quando a variável valer 11
            quantasVezes++;
        }

        // exibe essa mensagem no final, com o valor da variável
        System.out.println("Sai do laço e executei: "+(quantasVezes-1)+" vezes.");
    }
}
