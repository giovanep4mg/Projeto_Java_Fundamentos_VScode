public class DO_WHILE {
    public static void main(String[] args) throws Exception {
        // Laços de repetição, são usadas para fazer várias vezes uma ação.
        // DO WHILE -> FAÇA ENQUANTO irá realizar o laço pelo menos uma vez.

        // variável 
        int quantasVezes = 11;// AO COLOCAR 11 NÃO DEVERIA SE EXECUTADO MAIS É EXECUTADO 1 VEZ

        // enquanto, o valor da variável  for menor ou igual a 10
        do {

            // vai exibir essa mensagem, mostrando o valor da variável
            System.out.println("DO_WHILE -> Estou fazendo a "+quantasVezes+" vezes.");

            // acrescenta mais 1 a cada repetição, assim fará a repetição parar, quando a variável valer 11
            quantasVezes++;

        }while(quantasVezes <= 10);

        // exibe essa mensagem no final, com o valor da variável
        System.out.println("Sai do laço e executei: "+(quantasVezes-1)+" vezes.");
    }
}
