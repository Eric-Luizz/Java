// fila nao � uma estrutura de dados � tipo abstrato de dados
public class CodigoFila {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.adicionar("J�o");
		fila.adicionar("Z�");
		fila.adicionar("Juca");
		fila.adicionar("Maria");
		fila.adicionar("Ana");
		System.out.println("Primeiro da fila: "+fila.get());
		
		System.out.println("Removeu o : "+fila.get());
		fila.remover();
		System.out.println("Novo Primeiro da fila: "+fila.get());
		
	}

}
