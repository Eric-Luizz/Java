
public class Elementoo<TIPO> {
	private TIPO valor;
	private Elementoo<TIPO>esquerda;
	private Elementoo<TIPO>direita;
	
	public Elementoo(TIPO novoValor) {
		this.valor=novoValor;
		this.esquerda = null;
		this.direita = null;
	}

	public TIPO getValor() {
		return valor;
	}

	public void setValor(TIPO valor) {
		this.valor = valor;
	}

	public Elementoo<TIPO> getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Elementoo<TIPO> esquerda) {
		this.esquerda = esquerda;
	}

	public Elementoo<TIPO> getDireita() {
		return direita;
	}

	public void setDireita(Elementoo<TIPO> direita) {
		this.direita = direita;
	}	

}
