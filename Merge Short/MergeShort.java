import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MergeShort {
	private static Scanner entrada;
	
	int num;		
	int[] vetor;	
	 int numero = 0;
	public void Mergeshorts() {
		
		entrada = new Scanner(System.in);
		System.out.print("Digite um Numero: " );
		num = entrada.nextInt();
	    vetor= new int[num];	    
		
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
			
		    ergeSort(vetor,0,vetor.length-1);
		    System.out.println("\n\n-------Ordenado-------");
		    for(int i=0;i<vetor.length;i++) {
		    System.out.print(vetor[i]+ " ");
		    }		
	}	
	
	  public static void ergeSort(int[]vetor,int inicio,int fim) {
		 	
		if(inicio <fim) {
			int meio= (inicio+fim)/2;
			ergeSort(vetor,inicio,meio);
			ergeSort(vetor,meio+1,fim);
			intercalar(vetor,inicio,meio,fim);		
		}
	}
	 
	 private static void intercalar(int[] vetor,int inicio,int meio,int fim) {
			
		int[] esquerdo= new int[meio-inicio+1];
		int[] direita=new int[fim-meio];
		
		for(int i=0;i<esquerdo.length;i++) {
			esquerdo[i]=vetor[inicio+i];
		}
		for(int j=0;j<direita.length;j++) {
			direita[j]=vetor[meio+1+j];
		}
		int novaesquerda=0,novadireita=0;
		
		int novovetor=inicio;
		
		while(novaesquerda<esquerdo.length && novadireita<direita.length){
			if(esquerdo[novaesquerda] <=direita[novadireita]) {
				vetor[novovetor]=esquerdo[novaesquerda++];
			}else {
				vetor[novovetor]=direita[novadireita++];
			}
			novovetor++;
		}
		
		while(novaesquerda<esquerdo.length){
			vetor[novovetor]=esquerdo[novaesquerda++];
			novovetor++;
		}
		while(novadireita<direita.length){
			vetor[novovetor]=direita[novadireita++];
			novovetor++;
		}		
	}
}
