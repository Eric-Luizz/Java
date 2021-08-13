
public class GrafoTeste {

	public static void main(String[] args) {
		Grafo<String>grafo=new Grafo<String>();
		grafo.AddVertice("Jo�o");
		grafo.AddVertice("Lorenzo");
		grafo.AddVertice("Creuza");
		grafo.AddVertice("Cr�ber");
		grafo.AddVertice("Cr�udio");	
		
		grafo.addAresta(2.0, "Jo�o","Lorenzo");
		grafo.addAresta(3.0, "Lorenzo","Cr�ber");
		grafo.addAresta(1.0, "Cr�ber","Creuza");
		grafo.addAresta(1.0, "Jo�o","Creuza");
		grafo.addAresta(2.0, "Cr�udio","Lorenzo");
		grafo.addAresta(3.0, "Cr�udio","Jo�o");
		
		grafo.BuscaemLargura();
		
	}

}
