import java.util.Scanner;

public class CountSort {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		
		entrada = new Scanner(System.in);
		System.out.print("Digite um Numero: " );
		int num = entrada.nextInt();
	    int[]vetor= new int[num];	
	    
	    for(int i=0;i<vetor.length;i++) {
	    	vetor[i]=(int)(Math.random()*vetor.length );
	    }
	    
	    System.out.println("-------Desordenado-------");
	    for(int i=0;i<vetor.length;i++) {
	    System.out.print(vetor[i]+ " ");
	    }	    
		
	    countSort(vetor,vetor.length);
	    System.out.println("\n\n-------Ordenado-------");
	    for(int i=0;i<vetor.length;i++) {
	    System.out.print(vetor[i]+ " ");
	    }
		

	}
	static void countSort(int vetor[], int tamanho) {
	    int[] saida = new int[tamanho + 1];

	    //Encontre o maior elemento da matriz
	    int max = vetor[0];
	    for (int i = 1; i < tamanho; i++) {
	      if (vetor[i] > max)
	        max = vetor[i];
	    }
	    int[] count = new int[max + 1];

	    // Inicialize a matriz de contagem com todos os zeros.
	    for (int i = 0; i < max; ++i) {
	      count[i] = 0;
	    }

	    //Armazene a contagem de cada elemento
	    for (int i = 0; i < tamanho; i++) {
	      count[vetor[i]]++;
	    }

	    // Armazene a contagem cumulativa de cada matriz
	    for (int i = 1; i <= max; i++) {
	      count[i] += count[i - 1];
	    }

	    //Encontre o índice de cada elemento da matriz original na matriz de contagem e
	    //coloque os elementos na matriz de saída
	    for (int i = tamanho - 1; i >= 0; i--) {
	      saida[count[vetor[i]] - 1] = vetor[i];
	      count[vetor[i]]--;
	    }

	    // Copie os elementos classificados na matriz original
	    for (int i = 0; i < tamanho; i++) {
	    	vetor[i] = saida[i];
	    }
	}    

	
	
}
