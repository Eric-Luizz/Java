
public class Element<TIPO> {
	private TIPO valor;
	private Elemento<TIPO> proximo;
	
	
	
	public Element(TIPO valor) {
		
		this.valor = valor;
	}
	public TIPO getValor() {
		return valor;
	}
	public void setValor(TIPO valor) {
		this.valor = valor;
	}
	public Elemento<TIPO> getProximo() {
		return proximo;
	}
	public void setProximo(Elemento<TIPO> proximo) {
		this.proximo = proximo;
	}

}
