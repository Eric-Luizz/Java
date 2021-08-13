
public class Pilha {
	private ListLigada<Object> lista;
	
	public Pilha() {
		this.lista= new ListLigada<Object>();
	}
	
	public void adicionar(Object novoValor) {
		this.lista.adicionarComeco(novoValor);
	}
	public void remover() {
		this.lista.remover(this.get());
		
	}
	public Object get() {
		return this.lista.getPrimeiro().getValor();
	}

}
