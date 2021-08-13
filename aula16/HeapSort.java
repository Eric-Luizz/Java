import java.util.*;

public class HeapSort {
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
		
	    int n =vetor.length;
	    // heap sort
	    for(int i = n/2-1;i>=0;i--) {
	    	aplicarHeap(vetor,n,i);
	    }
		
	    System.out.println("\n-------Semi-ordenado-------");
	    for(int i=0;i<vetor.length;i++) {
	    System.out.print(vetor[i]+ " ");
	    }
	    
	    for(int j=n-1;j>0;j--) {
	    	int aux=vetor[0];
	    	vetor[0]=vetor[j];
	    	vetor[j]=aux;
	    	aplicarHeap(vetor,j,0);
	    }
	    
	    System.out.println("\n-------ordenado-------");
	    for(int i=0;i<vetor.length;i++) {
	    System.out.print(vetor[i]+ " ");
	    }
		
		

	}
	private static void aplicarHeap(int[]vetor,int n,int i) {
		int raiz=i;
		int esquerda = 2*i+1;
		int direita=2*i+2;
		
		if(esquerda <n &&vetor[esquerda]>vetor[raiz]) {
			raiz=esquerda;
		}
		if(direita < n && vetor[direita] > vetor[raiz]) {
			raiz=direita;
		}
		if (raiz !=i) {
			int aux = vetor [i];
			vetor[i]=vetor[raiz];
			vetor[raiz]=aux;
			
			aplicarHeap(vetor,n,raiz);
		}
	}

}
