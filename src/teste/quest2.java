package teste;

import java.util.Scanner;

public class quest2 {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
        
	    System.out.println("Digite um número interio: ");
	    int N = sc.nextInt();
        int proximo = , anterior = 0, atual = 1;
       
       int fib[] = new int[N];
        
        if(N == anterior) {
        	fib[0]= anterior;
        	System.out.println("O número " + N + "  pertence a sequencia de Fibonacci");
        }else if(N== atual){
        	fib[1]= atual;
        	System.out.println("O número " + N + "  pertence a sequencia de Fibonacci");
        }else if(N == proximo) {
           		System.out.println("O número " + N + "  pertence a sequencia de Fibonacci");
        	for (int i = 0; i < N; i++) {
               	proximo = anterior + atual;
            	anterior = atual;
            	atual = proximo;
               	fib[i+ 2]= proximo;
               		
               	}
        	
               		System.out.println("O número " + N + " não pertence a sequencia de Fibonacci");
               	}
            	
        		

        
        sc.close();
 	}
}
