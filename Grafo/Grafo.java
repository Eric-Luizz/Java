import java.util.*;

public class Grafo<Pessoa> {
	private ArrayList<Vertice<Pessoa>> vertices;
	private ArrayList<Aresta<Pessoa>> arestas;
	
	public Grafo() {		
		this.vertices = new ArrayList<Vertice<Pessoa>>();
		this.arestas = new ArrayList<Aresta<Pessoa>>();
	}
	public ArrayList<Vertice<Pessoa>> getVertices() {
		return vertices;
	}
	public void setVertices(ArrayList<Vertice<Pessoa>> vertices) {
		this.vertices = vertices;
	}
	public ArrayList<Aresta<Pessoa>> getArestas() {
		return arestas;
	}
	public void setArestas(ArrayList<Aresta<Pessoa>> arestas) {
		this.arestas = arestas;
	}

	public void AddVertice(Pessoa dado){
		Vertice<Pessoa> novoVertice=new Vertice<Pessoa>(dado);
		this.vertices.add(novoVertice);
	}
	
	public void addAresta(Double peso, Pessoa dadoInicio,Pessoa dadoFim){
		Vertice<Pessoa> inicio= this.getVertice(dadoInicio);
		Vertice<Pessoa> fim= this.getVertice(dadoFim);
		Aresta<Pessoa> aresta = new Aresta<Pessoa>(peso,inicio,fim);
		inicio.addArestaSaida(aresta);
		fim.addArestaEntrada(aresta);
		this.arestas.add(aresta);
	}
	
	public Vertice<Pessoa> getVertice(Pessoa dado){
		Vertice<Pessoa> vertice= null;
		for(int i=0;i< this.vertices.size();i++) {
			if(this.vertices.get(i).getDado().equals(dado)){
				vertice= this.vertices.get(i);
				break;
			}
		}
		return vertice;
	}
	
	public void BuscaemLargura() {
		ArrayList<Vertice<Pessoa>>marcados=new ArrayList<Vertice<Pessoa>>();
		ArrayList<Vertice<Pessoa>>fila=new ArrayList<Vertice<Pessoa>>();
		Vertice<Pessoa>atual=this.vertices.get(0);
		marcados.add(atual);
		System.out.println(atual.getDado());
		fila.add(atual);
		while(fila.size()>0){
			Vertice<Pessoa>visitado = fila.get(0);
			for(int i=0;i<visitado.getArestasSaida().size();i++){
				Vertice<Pessoa>proximo=visitado.getArestasSaida().get(i).getFim();
				if(!marcados.contains(proximo)) {// se o vertice ainda nao foi marcado
					marcados.add(proximo);
					System.out.println(proximo.getDado());
					fila.add(proximo);
				}
				
			}
			fila.remove(0);
		}
		
	}

}
