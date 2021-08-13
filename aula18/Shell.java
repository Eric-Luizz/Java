
public class Shell {
	
	public static Resultado Sort(int[] vetor) { 
		int trocas=0;
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
		    			trocas++;
		    		}
		    		vetor[j]=elemento;
		    		trocas++;
		    		
		    	}
		    	h=h/2;
		    	
		    }
		    
		    for(int i=0;i<vetor.length;i++) {
		    	//System.out.print(vetor[i]+" ");
		    }
		
		return new Resultado(vetor,trocas);
	}
	
	

}
