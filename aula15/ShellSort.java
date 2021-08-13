import java.util.*;
public class ShellSort {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		System.out.print("Digite um Numero: " );
		int num = entrada.nextInt();
	    int[]vetor= new int[num];	    	    
	    int numero = 0;	    
	    
		  Stack<Integer>Numeros =new Stack<Integer>();
		    System.out.println("-------Desordenado-------");
	    for( int i=0;i<num;i++) {
	    	vetor[i]=(int)(Math.random()*num);
	    	while(Numeros.contains(numero)) {
	    		numero=(int)(Math.random()*num);
			  }
			  Numeros.push(numero);
			  vetor[i]=numero;
			  System.out.println(vetor[i]);
	    }
	   // for(int i=0;i<vetor.length;i++) {
	    //	vetor[i]=(int)(Math.random()*vetor.length );
	   // }
	    
	    //shellshort
	    int h =1;
	    int n = vetor.length;
	    while(h<n) {
	    	h=h*3+1;
	    }
	    h=(int) Math.floor(h/3);
	    
	    int elemento,j;
	    while(h>0) {
	    	for(int i =h;i<n;i++) {
	    		elemento=vetor[i];
	    		j=i;
	    		while(j>=h && vetor[j - h]>elemento) {
	    			vetor[j]=vetor[j - h];
	    			j=j-h;	    			
	    		}
	    		vetor[j]=elemento;
	    	}
	    	h=h/2;	    	
	    }
	    System.out.println("-------Ordenado-------");
	    for(int i=0;i<vetor.length;i++) {
	    	System.out.println(vetor[i]);
	    }		
	    
	    

	}

}
