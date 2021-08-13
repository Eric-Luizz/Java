import java.util.*;
public class SelectionSort {
	private static Scanner entrada;
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite  Numero: " );
		int n = entrada.nextInt();
	    int[]vetor= new int[n];
	    
	    for(int i=0;i<vetor.length;i++) {
	    	vetor[i]=(int)(Math.random()*vetor.length );
	    }
	    
	    System.out.println("-------Desordenado-------");
	    for(int i=0;i<vetor.length;i++) {
	    	System.out.println(vetor[i]);
	    }
	    //selection sort
	    int posicao_menor,aux;
	    for(int i=0;i<vetor.length;i++) {
	    	posicao_menor=i;
	    	for(int j=i+1;j<vetor.length;j++) {
	    		if(vetor[j]<vetor[posicao_menor]) {
	    			posicao_menor = j;
	    		}
	    	}
	    	aux=vetor[posicao_menor];
	    	vetor[posicao_menor]=vetor[i];
	    	vetor[i]=aux;
	    }
	    
	    System.out.println("-------Ordenado-------");
	    for(int i=0;i<vetor.length;i++) {
	    	System.out.println(vetor[i]);
	    
	    }
	    
	    
	    
	    
	}

}
