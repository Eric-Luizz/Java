
public class Aresta<Pessoa> {
	private Double peso;
	private Vertice<Pessoa>inicio;
	private Vertice<Pessoa>fim;
	
	
	
	public Aresta(Double peso, Vertice<Pessoa> inicio, Vertice<Pessoa> fim) {
		super();
		this.peso = peso;
		this.inicio = inicio;
		this.fim = fim;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Vertice<Pessoa> getInicio() {
		return inicio;
	}
	public void setInicio(Vertice<Pessoa> inicio) {
		this.inicio = inicio;
	}
	public Vertice<Pessoa> getFim() {
		return fim;
	}
	public void setFim(Vertice<Pessoa> fim) {
		this.fim = fim;
	}
	
	
	
	
	
}
