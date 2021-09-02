import java.util.Scanner;
import java.util.Stack;

public class RadixSort {
	private static Scanner entrada;

	public static void main(String[] args) {
		radix r = new radix();
		entrada = new Scanner(System.in);
		// nesse modo funciona com valores acima de 9
		// por que sim !!
		System.out.print("Digite um Numero: " );
		int num=0;
		int numero = 0;
		num = entrada.nextInt();
	    int[]vetor= new int[num];
	    //Não repetir numeros 
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
		    r.radixSort(vetor, vetor.length);
		    System.out.println("\n\n-------Ordenado-------");
		    for(int i=0;i<vetor.length;i++) {
		    System.out.print(vetor[i]+ " ");
		    } 

	}
	


}
