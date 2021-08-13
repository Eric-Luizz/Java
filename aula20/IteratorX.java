
public class IteratorX<TIPO> {
	private Elemento<TIPO>elemento;
	
	public IteratorX(Elemento<TIPO> primeiro) {
		this.elemento = primeiro;
	}
	public boolean temProximo() {
		if(elemento.getProximo()==null) {
			return false;
		}else {
			return true;
		}
	
	}
		public Elemento<TIPO>getProximo(){
			elemento= elemento.getProximo();
			return elemento;
		}

}
