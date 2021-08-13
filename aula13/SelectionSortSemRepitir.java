import java.util.*;

public class SelectionSortSemRepitir {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite  Numero: " );
		int n = entrada.nextInt();
	    int[]vetor= new int[n];
	    int numero = 0,i=0;
	    
		  Stack<Integer>Numeros =new Stack<Integer>();

	    for( i=0;i<n;i++) {
	    	vetor[i]=(int)(Math.random()*n+1 );
	    	while(Numeros.contains(numero)) {
	    		numero=(int)(Math.random()*n+1);
			  }
			  Numeros.push(numero);
			  vetor[i]=numero;
	    }
	    
	    System.out.println("-------Desordenado-------");
	    for(i=0;i<n;i++) {
	    	System.out.println(vetor[i]);
	    }
	    //selection sort
	    int posicao_menor,aux;
	    for( i=0;i<n;i++) {
	    	posicao_menor=i;
	    	for(int j=i+1;j<n;j++) {
	    		if(vetor[j]<vetor[posicao_menor]) {
	    			posicao_menor = j;
	    		}
	    	}
	    	aux=vetor[posicao_menor];
	    	vetor[posicao_menor]=vetor[i];
	    	vetor[i]=aux;
	    }
	    
	    System.out.println("-------Ordenado-------");
	    for( i=0;i<n;i++) {
	    	System.out.println(vetor[i]);
	    
	    }

	}

}
