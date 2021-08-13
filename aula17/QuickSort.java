import java.util.*;
public class QuickSort {
	private static Scanner entrada;

	public static void main(String[] args) {
			
		entrada = new Scanner(System.in);
		System.out.print("Digite um Numero: " );
		int num = entrada.nextInt();
	    int[]vetor= new int[num];	    	    
	    int numero = 0;	    
	    
		  Stack<Integer>Numeros =new Stack<Integer>();
		   
	    for( int i=0;i<num;i++) {
	    	vetor[i]=(int)Math.floor (Math.random()*num+1);
	    	
	    	while(Numeros.contains(numero)) {
	    		numero=(int)Math.floor(Math.random()*num+1);
			  }
			  Numeros.push(numero);
			  vetor[i]=numero;
			  
	    }
			
	    System.out.println("-------Desordenado-------");
	    for(int i=0;i<vetor.length;i++) {
	    System.out.print(vetor[i]+ " ");
	    }	    
		
	    quicksort(vetor,0,vetor.length-1);
	    System.out.println("\n\n-------Ordenado-------");
	    for(int i=0;i<vetor.length;i++) {
	    System.out.print(vetor[i]+ " ");
	    }
	    
	}
	
	static void quicksort(int[]vetor,int esquerda,int direita) {
		if(esquerda<direita) {
    	int p =particao(vetor,esquerda,direita);
    	quicksort(vetor,esquerda,p);
    	quicksort(vetor,p+1,direita);
		}
    }
	static int particao(int[]vetor,int esquerda,int direita) {
		int meio=(int)(esquerda+direita)/2;
		int pivot= vetor[meio];
		int i=esquerda-1;
		int j =direita+1;
		while(true) {
			do {
				i++;
			}while(vetor[i]< pivot);
			do {
				j--;
			}while(vetor[j]>pivot);
			if(i>=j) {
				return j;
			}
			int aux=vetor[i];
			vetor[i]=vetor[j];
			vetor[j]=aux;
		}
		
		
		
		
		
	}

}
