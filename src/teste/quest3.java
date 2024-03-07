package teste;

public class quest3 {
	
	public static void main(String []args) {
		
		int sequenciaA = 1;
		int sequenciaB = 2;
		int sequenciaC = 0;
		int sequenciaD = 4;
		int sequenciaE = 1;
		int sequenciaF = 200;
		
		int aux  = 1;
		int aux1 = 12;
		int atual;
		int anterior = 0;
		
		for (int i =1; i <5; i++) {
			
			sequenciaA = sequenciaA+ 2;
			
		}
		
		for (int i =1; i <7; i++) {
			
			sequenciaB = sequenciaB * 2;
			
		}
		
		for (int i =1; i <8; i++) {

			sequenciaC = sequenciaC + aux;
			aux = aux + 2;
			
		}

		for (int i =1; i <5; i++) {
			
			sequenciaD = sequenciaD + aux1;
			aux1 = aux1 + 8;
						
		}
		
		for (int i =1; i <7; i++) {
			
			atual = sequenciaE;
			sequenciaE = atual + anterior;
			anterior = atual;
			System.out.println(sequenciaE + ",");
			
		}

		System.out.println("Próximo elemento alternativa A: " + sequenciaA );
		System.out.println("Próximo elemento alternativa B: " + sequenciaB );
		System.out.println("Próximo elemento alternativa C: " + sequenciaC );
		System.out.println("Próximo elemento alternativa D: " + sequenciaD );
		System.out.println("Próximo elemento alternativa E: " + sequenciaE );
		System.out.println("Próximo elemento alternativa F: " + sequenciaF );
			
	}

}
