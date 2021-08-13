
public class Fila {
	private ListaLigada<Object> lista;
	
	
	
	
	public Fila() {
		
		this.lista = new ListaLigada<Object>();
	}
	public void adicionar(String novoValor) {
		this.lista.adicionar(novoValor);
	}
	public void remover() {
		this.lista.remover(this.get());
		
	}
	public Object get() {
		return this.lista.getPrimeiro().getValor();
	}
	
	
	
	
	
	
	
	
	
	
	

}
