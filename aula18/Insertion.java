
public class Insertion {
	public static Resultado Sort(int[] vetor) {
		int trocas=0;
		int j,aux;
		for(int i=1;i<vetor.length;i++) { 
			aux =vetor[i];
			j=i-1;
			while(j>= 0 &&vetor[j] > aux) {
				vetor[j+1]=vetor[j];
				j--;
				trocas++;
				}
				vetor[j+1]=aux;
				trocas++;
			}
	
		for(int i=0;i<vetor.length;i++) {
			//System.out.print(vetor[i]+" ");
		}
		
		
		
		return new Resultado(vetor,trocas);
	}
	
	
	
	
	

}
