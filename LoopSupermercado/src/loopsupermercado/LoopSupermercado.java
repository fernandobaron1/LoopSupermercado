
package loopsupermercado;

import java.util.Scanner;


public class LoopSupermercado {

   
    public static void main(String[] args) {
       
            Scanner leia = new Scanner (System.in);
       int entrada = 0;
       int total = 0;
       int quantidade = 0;
       int total2 = 0;
       
       for (int i = 1; i <= 10; i++) {
           System.out.println ("Informe o valor:");
           entrada = leia.nextInt();
           
           System.out.println ("Digite a quantidade:");
           quantidade = leia.nextInt();
           
           total += entrada * quantidade;
           total2 = (entrada * quantidade);
           System.out.println("Valor do Produto: "+entrada+" Quantidade: "+quantidade+"      Subtotal: "+total2);
           System.out.println("Somatória: "+total);
           
       }
       System.out.println("");
       System.out.println("O total é: "+total);
    }
    }
    

