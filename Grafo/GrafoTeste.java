
public class GrafoTeste {

	public static void main(String[] args) {
		Grafo<String>grafo=new Grafo<String>();
		grafo.AddVertice("João");
		grafo.AddVertice("Lorenzo");
		grafo.AddVertice("Creuza");
		grafo.AddVertice("Créber");
		grafo.AddVertice("Cráudio");	
		
		grafo.addAresta(2.0, "João","Lorenzo");
		grafo.addAresta(3.0, "Lorenzo","Créber");
		grafo.addAresta(1.0, "Créber","Creuza");
		grafo.addAresta(1.0, "João","Creuza");
		grafo.addAresta(2.0, "Cráudio","Lorenzo");
		grafo.addAresta(3.0, "Cráudio","João");
		
		grafo.BuscaemLargura();
		
	}

}
