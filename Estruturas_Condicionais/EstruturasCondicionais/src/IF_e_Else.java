public class IF_e_Else {
    public static void main(String[] args) throws Exception {
        // Estruturas Condicionais são usadas para fazer verificações
        // Vamos ver o IF e o ELSE

        // variáveis com seus valores
        int num1 = 10, num2 = 20;

System.out.println("====================== Condicionais IF e ELSE ==========================\n");
        
        // fazer a verificação se o número 1 é maior que o número 2
        if(num1 > num2){
            System.out.println("O número: "+num1+" é maior que o número: "+num2);
        } else {
            System.out.println("O número: "+num2+" é maior que o número: "+num1);
        } 

        System.out.println();    

System.out.println("================ Condicionais IF e ELSE Intermediário =================\n");
        /*
        *   Estrutura Condicionais ---> Condição Intermediária
        */

        // passando valores diferentes para as variáveis
        int num3 = 40, num4 = 30;

        // se num3 for maior que num4
        if(num3 > num4){
            System.out.println("O número: "+num3+" é maior que o número: "+num4);
        // se num3 for menor que o num4    
        } else if(num3 < num4){
            System.out.println("O número: "+num3+" é menor que o número: "+num4);
        // senao, se não é maior nem menor é igual
        } else {
            System.out.println("O número: "+num3+" é igual ao número: "+num4);
        }

        System.out.println(); 
        
System.out.println("=======================================================================\n");


    }
}
