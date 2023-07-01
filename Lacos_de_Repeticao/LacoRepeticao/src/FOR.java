public class FOR {
    public static void main(String[] args) throws Exception {
        // Laços de repetição, são usadas para fazer várias vezes uma ação.
        // FOR -> PARA .
        // muito usado nas Arrays, Arraylist mas pode ser usado no lugar do while, do_while

System.out.println("============================ FOR =====================================");
        
        // variável 
        int quantasVezes = 0;

        /* Adiciona o valor na variável -> 1.
         * Faz a verificação, enquanto a variável for menor ou igual a 10.
         * Acrescenta mais 1 ao valor dentro da variável, para encerrar o FOR.
         */
        for(int quantasVezes1 = 1; quantasVezes1 <=10; quantasVezes1++){

            // vai exibir essa mensagem, mostrando o valor da variável
            System.out.println("FOR -> Estou fazendo a "+quantasVezes1+" vezes.");

            // salva na variável quantasVezes o resultado do for
            quantasVezes = quantasVezes1;

        }

        // exibe essa mensagem no final, com o valor da variável
        System.out.println("Sai do laço e executei: "+(quantasVezes)+" vezes.");

System.out.println("==========================FOR COM PARADA ==============================");

        /* Adiciona o valor na variável -> 1.
         * Faz a verificação, enquanto a variável for menor ou igual a 10.
         * Acrescenta mais 1 ao valor dentro da variável, para encerrar o FOR.
         */
        for(int quantasVezes1 = 1; quantasVezes1 <=10; quantasVezes1++){

            // vai exibir essa mensagem, mostrando o valor da variável
            System.out.println("FOR -> Estou fazendo a "+quantasVezes1+" vezes.");

            // se o valor da variável for igual a 5
            if(quantasVezes1 == 5){

                // exibi a mensagem com os valores, até o número 5
                System.out.println("Parei na "+quantasVezes1+" vezes.");

                // para o código, como no case
                break;
            }

        }
    }
}
