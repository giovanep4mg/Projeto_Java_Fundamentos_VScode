import javax.swing.JOptionPane;

public class JOption_PegarDados {
    public static void main(String[] args) throws Exception {
        // Entrada de dados -> como pegar os dados do usuário
        // USANDO O JOptionPane para pegar dados do usuário
        // os dados digitados sempre serão do tipo String
        // o JOptionPane exibi uma caixa de texto para pegar e exibir algo. 
    

System.out.println("========================= Pegando TEXTO ==============================\n");            
            
        // variável que irá guarda o nome que o usuário digitar
        String nome;

        nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");


System.out.println("==================== Pegando NÚMEROS INTEIROS ========================\n");
            
        // variável que vai guardar o número inteiro
        int idade;

        //
        idade = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Digite a sua idade: ")); 
            

System.out.println("==================== Pegando NÚMEROS DECIMAIS ========================\n");

        // variável que vai guardar o número decimal
        double peso;

        //
        peso = Double.parseDouble(JOptionPane.showInputDialog(
                null, "Digite o seu peso: ")); 

        

System.out.println("============================ RESULTADOS ============================\n");

        // exibi o nome digitado
        JOptionPane.showMessageDialog(null,"O nome digitado foi:\n"+nome);

        // exibi a idade digitado
        JOptionPane.showMessageDialog(null,"A idade digitada foi:\n"+idade);

        // exibi o peso digitado
        JOptionPane.showMessageDialog(null,"O peso digitado foi:\n"+peso);



System.out.println("=============================== fim ================================\n");

            
        
        }



    
}
