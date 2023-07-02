package Polimorfismo;
public class Polimorfismo {
    public static void main(String[] args) throws Exception {
        
        // instanciando a classe Mamifero
        Mamifero mamifero1 = new Elefante();

        // instanciando a classe Rato
        Mamifero mamifero2 = new Rato();

        // instanciando a classe Cavalo
        Mamifero mamifero3 = new Cavalo();


System.out.println("========================= Mamifero Elefante  ==============================\n");

        System.out.println("A cota diária de leite de um elefante é: "+mamifero1.cotaDiariaLeite()+" ml.");

System.out.println("=========================== Mamifero Rato  ===============================\n");

        System.out.println("A cota diária de leite de um Rato é: "+mamifero2.cotaDiariaLeite()+" ml.");

System.out.println("========================= Mamifero Cavalo  ==============================\n");

        System.out.println("A cota diária de leite de um Cavalo é: "+mamifero3.cotaDiariaLeite()+" ml.");

System.out.println("===========================================================================\n");


    }
}
