
public class Selection {
	public static Resultado Sort(int[] vetor) { 
		int trocas=0;
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
		    	trocas++;
		    }
		    
		   
		    for(int i=0;i<vetor.length;i++) {
		    	//System.out.print(vetor[i]+" ");
		    
		    }
		
		
		
		return new Resultado(vetor,trocas);
	}

}
