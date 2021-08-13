	import java.util.*;
public class Bubble {
			
	
	public static Resultado Sort(int[] vetor) {
				
		int aux;
		int trocas=0;
		for(int i=0;i<vetor.length;i++) {
			for(int j= i+1;j<vetor.length;j++) {
				if(vetor[i]>vetor[j]) {
					aux= vetor[j];
					vetor[j]=vetor[i];
					vetor[i]=aux;
					trocas++;
				}
			}
		}		
		for(int i=0;i<vetor.length;i++) {
			
	    	//System.out.print(vetor[i]+ " ");
	    	
		} 		
		return new Resultado(vetor,trocas);
	}
	
	
	
	
	
	
	

}
