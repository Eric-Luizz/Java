import java.util.Scanner;
import java.util.Stack;

public class ComparcaoDeTempo {
	private static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		System.out.print("Digite um Numero: " );
		int num = entrada.nextInt();
		int [] vetor = new int [num];
		int numero=1;
		  Stack<Integer>Numeros =new Stack<Integer>();
		   
		    for( int i=0;i<vetor.length;i++) {
		    	vetor[i]=(int)Math.floor (Math.random()*vetor.length+1);
		    	
		    	while(Numeros.contains(numero)) {
		    		numero=(int)Math.floor(Math.random()*vetor.length+1);
				  }
				  Numeros.push(numero);
				  vetor[i]=numero;
				  
		    }
		    
		    		
		long inicio;
		long fim;
		Resultado resultado;
			
		System.out.println("Bubble Sort");
		inicio= System.currentTimeMillis();
		resultado=Bubble.Sort(vetor.clone());
		fim = System.currentTimeMillis();
		
		System.out.println("\nTempo: "+(fim-inicio)+"ms" );
		System.out.println("Trocas: "+resultado.getTrocas());
		System.out.println("----------------------");
		
		System.out.println("\nInsertion Sort");
		inicio= System.currentTimeMillis();
		resultado=Insertion.Sort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("\nTempo: "+(fim-inicio)+"ms" );
		System.out.println("Trocas: "+resultado.getTrocas());
		System.out.println("----------------------");
		
		System.out.println("\nSelection Sort");
		inicio= System.currentTimeMillis();
		resultado=Selection.Sort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("\nTempo: "+(fim-inicio)+"ms" );
		System.out.println("Trocas: "+resultado.getTrocas());
		System.out.println("----------------------");
		
		System.out.println("\nSell Sort");
		inicio= System.currentTimeMillis();
		resultado=Shell.Sort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("\nTempo: "+(fim-inicio)+"ms" );
		System.out.println("Trocas: "+resultado.getTrocas());
		System.out.println("----------------------");
		
		System.out.println("\nHeap");
		inicio= System.currentTimeMillis();
		resultado=Heap.Sort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("\nTempo: "+(fim-inicio)+"ms" );
		System.out.println("Trocas: "+resultado.getTrocas());
		System.out.println("----------------------");
		
		System.out.println("\nQuick");
		inicio= System.currentTimeMillis();
		resultado=Quick.Sort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("\nTempo: "+(fim-inicio)+"ms" );
		System.out.println("Trocas: "+resultado.getTrocas());
		System.out.println("----------------------");
		
		
		
		
		
	}

		

}
