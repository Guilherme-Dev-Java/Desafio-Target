package teste;

import javax.swing.JOptionPane;

public class quest5 {
	
	 public static void main(String args[]){
		 
         char [] palavra;
         char [] palavraInvertida = new char [palavra.length];
         
         int tamanhoPalavra = palavra.length;
         
         
         String frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");
         palavra = frase.toCharArray();
         
         for( int i = 0; i < palavra.length; i++) {
        	 System.out.print(palavra[i]);
         }
         
         
     }
 }


