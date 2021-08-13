import java.util.*;

public class SelectionSortClasse {
	
	int n=5;
    int[]vetor= new int[n];
    int numero = 0,i=0;
    int posicao_menor,aux;
    public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
    
    Stack<Integer>Numeros =new Stack<Integer>();
    
   

	public void SemRepitir() {
    	  for( i=0;i<vetor.length;i++) {
  	    	vetor[i]=(int)(Math.random()* vetor.length+1 );
  	    	while(Numeros.contains(numero)) {
  	    		numero=(int)(Math.random()*vetor.length+1);
  			  }
  			  Numeros.push(numero);
  			  vetor[i]=numero;
  	    }
    	
    }
    
    public void SelectionSort() {
    	//selection sort	   
	    for( i=0;i<vetor.length;i++) {
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
    }
    
    public void Desodenado() {
    	System.out.println("-------Desordenado-------");
	    for(i=0;i<vetor.length;i++) {
	    	System.out.println(vetor[i]);
	    }
    	
    }
    
    public void Ordenado() {
    	System.out.println("-------Ordenado-------");
	    for( i=0;i<vetor.length;i++) {
	    	System.out.println(vetor[i]);
	    
	    }
    	
    }

	
    

}
