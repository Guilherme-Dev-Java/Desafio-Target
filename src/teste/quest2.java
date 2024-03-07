package teste;

import java.util.Scanner;

public class quest2 {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
        
	    System.out.println("Digite um número interio: ");
	    int n = sc.nextInt();
        int proximo, anterior = 0, atual = 1;
        int cout = 0;
        
        int fib[] = new int [(n+2)];
        fib[0]= anterior;
   		fib[1]= atual;
   		
   	
   		 
   			for (int i = 2; i <= n; i++) {
         	
         	
         	proximo = anterior + atual;
         	anterior = atual;
         	atual = proximo;
         	
         	fib[i] = proximo;
         }
                		
         for (int i = 0; i <= n; i++) {
         	if(n == fib[i]) {
         		cout = cout + 1;
         	}
          	
         	}
         
         if(cout == 1) {
         	System.out.println("o número " + n +" pertence a sequencia de Fibonacci");
         }else
         	System.out.println("o número " + n +" não pertence a sequencia de Fibonacci");
        
   		

   		
        
         sc.close();
 	}
}
