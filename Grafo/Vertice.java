import java.util.*;

public class Vertice<Pessoa> {
	
	private Pessoa dado;
	private ArrayList<Aresta<Pessoa>>arestasEntrada;
	private ArrayList<Aresta<Pessoa>>arestasSaida;

	public Vertice(Pessoa valor) {
		this.dado=valor;
		this.arestasEntrada=new ArrayList<Aresta<Pessoa>>();
		this.arestasSaida= new ArrayList<Aresta<Pessoa>>();
	}
	
	public void addArestaEntrada(Aresta<Pessoa>aresta){
		this.arestasEntrada.add(aresta);
	}
	
	public void addArestaSaida(Aresta<Pessoa>aresta){
		this.arestasSaida.add(aresta);
	}

	public Pessoa getDado() {
		return dado;
	}

	public void setDado(Pessoa dado) {
		this.dado = dado;
	}
	public ArrayList<Aresta<Pessoa>> getArestasEntrada() {
		return arestasEntrada;
	}

	public void setArestasEntrada(ArrayList<Aresta<Pessoa>> arestasEntrada) {
		this.arestasEntrada = arestasEntrada;
	}

	public ArrayList<Aresta<Pessoa>> getArestasSaida() {
		return arestasSaida;
	}

	public void setArestasSaida(ArrayList<Aresta<Pessoa>> arestasSaida) {
		this.arestasSaida = arestasSaida;
	}
	
	
	
}
