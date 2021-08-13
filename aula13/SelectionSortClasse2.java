import java.util.*;

public class SelectionSortClasse2<TIPO> {
	private int n;
    private int[]vetor;
    private int numero;
    
   
    public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
    
	
    


	Stack<Integer>Numeros =new Stack<Integer>();
    Random Rnd = new Random();
	
	public void Selecao() {
		int[]vetor= new int[n];
		 int posicao_menor,aux;
		  for( int i=0;i<n;i++) {
	  	    	vetor[i]=(int)(Rnd.nextDouble()* vetor.length+1 );
	  	    	while(Numeros.contains(numero)) {
	  	    		numero=(int)(Rnd.nextDouble()*vetor.length+1);
	  			  }
	  			  Numeros.push(numero);
	  			  vetor[i]=numero;
	  	    }
		
		  
		  System.out.println("-------Desordenado-------");
		    for(int i=0;i<vetor.length;i++) {
		    	System.out.println(vetor[i]);
		    }
		//selection sort	   
		    for( int i=0;i<vetor.length;i++) {
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
	    for( int i=0;i<vetor.length;i++) {
	    	System.out.println(vetor[i]);
	    
	    }
		
		
		
	}

	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	

	

	public Stack<Integer> getNumeros() {
		return Numeros;
	}

	public void setNumeros(Stack<Integer> numeros) {
		Numeros = numeros;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
