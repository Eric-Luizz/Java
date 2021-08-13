import java.util.*;
public class Recusividade {

	private static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		System.out.print("Digite  Numero: " );
		int n = entrada.nextInt();
	    int[]vetor= new int[n];
	    
	    for(int i=0;i<vetor.length;i++) {
	    	vetor[i]=(int)(Math.random()*vetor.length );
	    }
	    
	    System.out.println("Vetor");
	    for(int i=0;i<vetor.length;i++) {
	    	System.out.println(vetor[i]);
	    }
	    System.out.println("Soma");
	    System.out.println(somar(0,0,vetor) );
	    
	    
	    
	    
	    
	    
	    
	}
	private static int somar(int soma,int posicao,int[] vetor) {
		if(posicao< vetor.length) {
			soma=soma + vetor[posicao];
		return somar(soma,posicao+1,vetor);
		}else {
			
			return soma;
		}
	}

}
