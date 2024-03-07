package teste;

import java.util.Scanner;

public class quest5 {
	
	 public static void main(String args[]){
		 
         Scanner sc = new Scanner(System.in);
         
         String palavra;
         
         System.out.println("Digite uma palavra: ");
         palavra = sc.nextLine();
         
         System.out.println();
         
         System.out.println("Palavra Digitada: " + palavra);
         System.out.printf("Palavra Inversida: %s\n", inverterPlavara(palavra));
      
         sc.close();
 }

	private static String inverterPlavara(String palavra) {
		int n;
		String pInvertda = "";
		
		n = palavra.length();
		
		for(int i = (n-1); i>=0; i--) {
			pInvertda = pInvertda + palavra.charAt(i);
		}
		
		
		return (pInvertda);
	}

}
