public class Operadores_Logicos {
    public static void main(String[] args) throws Exception {
        
        /*  
         *  Operadores Lógicos
         *  Se acontacer algo faz o A, se acontecer outra coisa faz o B 
         * 
         *      && , AND => significa E -> as duas verificações tem que dá certo
         * 
         *      || , OR => significa OU -> uma verificação dê certo 
         *  
        */

        // criando as variáveis 
        int num1 = 30;
        int num2 = 20;
        int num3 = 40, num4 = 20 ;
        

System.out.println("============================ Lógico E -> && ================================");
        
        // se o num1 for maior que o num3, EE num4 for igual ao num2 
        if( (num1 > num3) && (num4 == num2 ) ){
                // exibirá essa mensagem
                System.out.println("Primeira opção, operador Lógico E, as duas verificações deram certo.");
        } else {
                // se for menor, vai exibir essa mensagem
                System.out.println("Segunda opção, Nenhuma das verificações deu certo, ou somente uma deu certo!");
        }

        

System.out.println("============================ Lógico OU -> || ================================");

        // se o num1 for maior que o num3, OU num4 for igual ao num2 
        if( (num1 > num3) || (num4 == num2 ) ){
                // exibirá essa mensagem
                System.out.println("Primeira opção, operador Lógico OU, Umas das duas verificações deu certo.");
        } else {
                // se for menor, vai exibir essa mensagem
                System.out.println("Segunda opção, OU , nenhuma das verificações deu errado!");
        }


System.out.println("================================== FIM =====================================");
        
    }
}
