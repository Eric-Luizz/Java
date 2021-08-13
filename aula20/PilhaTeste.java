//pilha tipo abstrato de daods
public class PilhaTeste {

	public static void main(String[] args) {

		Pilha pilha = new Pilha();
		pilha.adicionar("F");
		pilha.adicionar("B");
		pilha.adicionar("Z");
		pilha.adicionar("D");
		pilha.adicionar("C");
		
		System.out.println("Topo: "+ pilha.get());
		pilha.remover();
				
		System.out.println("Topo: "+ pilha.get());		
		
		pilha.remover();		
		
		System.out.println("Topo: "+ pilha.get());
		pilha.remover();
				
		System.out.println("Topo: "+ pilha.get());
		
	
		
	}	

}
