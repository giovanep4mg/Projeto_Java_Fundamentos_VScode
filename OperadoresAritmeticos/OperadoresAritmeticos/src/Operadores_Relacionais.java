public class Operadores_Relacionais {
    public static void main(String[] args) throws Exception {
        
        /*  
         *  Operadores Relacionais
         *  >  => maior que ?
         *  < => menor que ?
         *  >= => maior ou igual a ?
         *  <= => menor ou igual a ?
         *  != => diferente de ?
         *  == => igual a ?
         *  
        */

        // criando as variáveis 
        int num1;
        int num2;
        
        // passa os valores para as variáveis
        num1 = 10;
        num2 = 30;

System.out.println("============================ Resultado Maior que ================================");
        
        // testando a igualdade
        // se o num1 for maior que o num2, 
        if(num1 > num2){
                // exibirá essa mensagem
                System.out.println("O número: "+num1+" é o maior: "+num2);
        } else {
                // se for menor, vai exibir essa mensagem
                System.out.println("O número: "+num1+" é o menor: "+num2); 
        }

        

System.out.println("============================ Resultado Menor que ================================");

        // testando a igualdade
        // se o num1 for menor que o num2, 
        if(num1 < num2){
                // exibirá essa mensagem
                System.out.println("O número "+num1+" é o menor que : "+num2);
        } else {
                // se for menor, vai exibir essa mensagem
                System.out.println("O número "+num1+" é o maior que : "+num2); 
        }

System.out.println("============================ Resultado Maior ou Igual ================================");

       // testando a igualdade
        // se o num1 for maior ou igual o num2, 
        if(num1 >= num2){
                // exibirá essa mensagem
                System.out.println("O número "+num1+" é maior ou igual: "+num2);
        } else {
                // se for menor, vai exibir essa mensagem
                System.out.println("O número "+num1+" é menor: "+num2); 
        }

System.out.println("============================ Resultado Menor ou Igual ================================");

        // testando a igualdade
        // se o num1 for menor ou igual o num2, 
        if(num1 <= num2){
                // exibirá essa mensagem
                System.out.println("O número "+num1+" é menor ou igual: "+num2);
        } else {
                // se for menor, vai exibir essa mensagem
                System.out.println("O número "+num1+" é maior: "+num2); 
        }

System.out.println("============================ Resultado Diferente de ================================");

        // testando a igualdade
        // se o num1 for Diferente o num2, 
        if(num1 != num2){
                // exibirá essa mensagem
                System.out.println("O número "+num1+" é diferente do: "+num2);
        } else {
                // se for menor, vai exibir essa mensagem
                System.out.println("O número "+num1+" não é diferente de : "+num2); 
        }

System.out.println("============================ Resultado Igual ================================");

        // testando a igualdade
        // se o num1 for Igual o num2, 
        if(num1 == num2){
                // exibirá essa mensagem
                System.out.println("O número "+num1+" é igual ao: "+num2);
        } else {
                // se for menor, vai exibir essa mensagem
                System.out.println("O número "+num1+" não é igual ao : "+num2); 
        }

System.out.println("================================== FIM =====================================");
        
    }
}
