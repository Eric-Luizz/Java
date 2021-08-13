	public class Arvore<TIPO extends Comparable<TIPO>> {
	
	private Elementoo<TIPO> raiz;
	
	public Arvore() {
		this.raiz=null;
	}
	
	public void adicionar (TIPO valor) {
		Elementoo <TIPO> novoElemento = new Elementoo<TIPO>(valor);
		if(raiz==null) {
			this.raiz = novoElemento;			
		}else {
			Elementoo<TIPO>atual = this.raiz;
			while(true) {
				if (novoElemento.getValor().compareTo(atual.getValor())== -1 ) {
					if(atual.getEsquerda() !=null){
						atual = atual.getEsquerda();
						
					}else {
						atual.setEsquerda(novoElemento);
						break;
					}
				}else { //se for maior ou igual
					if(atual.getDireita() !=null) {
						atual= atual.getDireita();
					}else {
						atual.setDireita(novoElemento);
						break;
					}
				}
			}
		}
		
	}
	
	public Elementoo<TIPO> getRaiz() {
		return raiz;
	}

	public void emOrdem(Elementoo<TIPO>atual){
		if(atual !=null){
			emOrdem(atual.getEsquerda());
			System.out.println(atual.getValor());
			emOrdem(atual.getDireita());			
		}		
	}
	public void preOrdem(Elementoo<TIPO>atual){
		if(atual !=null){			
			System.out.print(atual.getValor()+" ");
			emOrdem(atual.getEsquerda());
			emOrdem(atual.getDireita());			
		}		
	}
	public void posOrdem(Elementoo<TIPO>atual){
		if(atual !=null){			
			emOrdem(atual.getEsquerda());
			emOrdem(atual.getDireita());
			
			System.out.print(atual.getValor()+" ");
		}		
	}
	
	public boolean remover(TIPO valor) {
		//buscar elemento na árvore
		Elementoo<TIPO>atual=this.raiz;
		Elementoo<TIPO>paiAtual=null;
		while(atual !=null) {
			if (atual.getValor().equals(valor)) {
					break;
				//remover o elemento da arvore
			}else if(valor.compareTo(atual.getValor())==-1) {//valor procurado é menor que o atual
				paiAtual=atual;
				atual=atual.getEsquerda();
			}else {
				paiAtual=atual;
				atual=atual.getDireita();
			}
		}
		// verifica se existe elemento
		if(atual !=null) {
			
			// elemento tem 2 filhos ou elementos tem somente filho à direita
			if(atual.getDireita() !=null) {
				
				Elementoo<TIPO>substituto = atual.getDireita();
				Elementoo<TIPO>paiSubstituto=atual;
				while(substituto.getEsquerda() !=null){
					paiSubstituto=substituto;
					substituto=substituto.getEsquerda();
				}
				substituto.setEsquerda(atual.getEsquerda());
				if(paiAtual !=null){
					if(atual.getValor().compareTo(paiAtual.getValor())== -1){//atual < paiAtual
					   
					paiAtual.setEsquerda(substituto);
					}else {
					paiAtual.setDireita(substituto);
				
					}
				}else {//se nao tem paiAtual entao é raiz
						this.raiz=substituto;
					}
				
				//removeu o elemento da arvore
				if(substituto.getValor().compareTo(paiSubstituto.getValor())== -1){//substituto < paiSubstituto
					
					paiSubstituto.setEsquerda(null);
				}else {
					paiSubstituto.setDireita(null);
				
				}
				
				
			}else if (atual.getEsquerda() !=null) {//tem filho so esquerda
				Elementoo<TIPO>substituto = atual.getEsquerda();
				Elementoo<TIPO>paiSubstituto=atual;
				while(substituto.getDireita() !=null){
					paiSubstituto=substituto;
					substituto=substituto.getDireita();
				}
				if(paiAtual !=null){
					if(atual.getValor().compareTo(paiAtual.getValor())== -1){//atual < paiAtual
					
					paiAtual.setEsquerda(substituto);
					}else {
					paiAtual.setDireita(substituto);
				
							}	
				}else {//se for raiz
					this.raiz=substituto;
				}
				
				//removeu o elemento da arvore
				if(substituto.getValor().compareTo(paiSubstituto.getValor())== -1){//substituto < paiSubstituto
					
					paiSubstituto.setEsquerda(null);
				}else {
					paiSubstituto.setDireita(null);
				
				}
			}else {//nao tem filho
				if(paiAtual !=null){
					if(atual.getValor().compareTo(paiAtual.getValor())== -1){//atual > paiAtual
						
						paiAtual.setEsquerda(null);
					}else {
						paiAtual.setDireita(null);
					
					}
				}else {//é raiz
					this.raiz=null;
				}
			}
			return true;
		}else {
			
			return false;
		}
		
	}
	
}
//public class Arvore<TIPO extends Comparable> {
//    
//    private Elementoo<TIPO> raiz;
//    
//    public Arvore(){
//        this.raiz = null;
//    }
//    
//    public void adicionar(TIPO valor){
//        Elementoo<TIPO> novoElemento = new Elementoo<TIPO>(valor);
//        if (raiz == null){
//            this.raiz = novoElemento;
//        }else{
//            Elementoo<TIPO> atual = this.raiz;
//            while(true){
//                if (novoElemento.getValor().compareTo(atual.getValor()) == -1){
//                    if (atual.getEsquerda() != null){
//                        atual = atual.getEsquerda();
//                    }else{
//                        atual.setEsquerda(novoElemento);
//                        break;
//                    }
//                }else{ //se for maior ou igual
//                    if (atual.getDireita() != null){
//                        atual = atual.getDireita();
//                    }else{
//                        atual.setDireita(novoElemento);
//                        break;
//                    }
//                }
//            }
//        }
//    }
//
//    public Elementoo<TIPO> getRaiz() {
//        return raiz;
//    }
//    
//    public void emOrdem(Elementoo<TIPO> atual){
//        if (atual != null){
//            emOrdem(atual.getEsquerda());
//            System.out.println(atual.getValor());
//            emOrdem(atual.getDireita());
//        }        
//    }
//    
//    public void preOrdem(Elementoo<TIPO> atual){
//        if (atual != null){
//            System.out.println(atual.getValor());
//            preOrdem(atual.getEsquerda());            
//            preOrdem(atual.getDireita());
//        }        
//    }
//    
//    public void posOrdem(Elementoo<TIPO> atual){
//        if (atual != null){            
//            posOrdem(atual.getEsquerda());            
//            posOrdem(atual.getDireita());
//            System.out.println(atual.getValor());
//        }        
//    }
//    
//    public boolean remover(TIPO valor){
//        //buscar o elemento na árvore
//        Elementoo<TIPO> atual = this.raiz;
//        Elementoo<TIPO> paiAtual = null;
//        while(atual != null){
//            if (atual.getValor().equals(valor)){
//                break;                
//            }else if (valor.compareTo(atual.getValor()) == -1){ //valor procurado é menor que o atual 
//                paiAtual = atual;
//                atual = atual.getEsquerda();
//            }else{
//                paiAtual = atual;
//                atual = atual.getDireita();
//            }
//        }
//        //verifica se existe o elemento
//        if (atual != null){
//            
//            //elemento tem 2 filhos ou elemento tem somente filho à direita
//            if (atual.getDireita() != null){
//                
//                Elementoo<TIPO> substituto = atual.getDireita();
//                Elementoo<TIPO> paiSubstituto = atual;
//                while(substituto.getEsquerda() != null){
//                    paiSubstituto = substituto;
//                    substituto = substituto.getEsquerda();
//                }
//                substituto.setEsquerda(atual.getEsquerda());
//                if (paiAtual != null){
//                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
//                        paiAtual.setEsquerda(substituto);
//                    }else{
//                        paiAtual.setDireita(substituto);
//                    }
//                }else{ //se não tem paiAtual, então é a raiz
//                    this.raiz = substituto;
//                }
//                
//                //removeu o elemento da árvore
//                if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1){ //substituto < paiSubstituto
//                    paiSubstituto.setEsquerda(null);
//                }else{
//                    paiSubstituto.setDireita(null);
//                }
//                
//            }else if (atual.getEsquerda() != null){ //tem filho só à esquerda
//                Elementoo<TIPO> substituto = atual.getEsquerda();
//                Elementoo<TIPO> paiSubstituto = atual;
//                while(substituto.getDireita() != null){
//                    paiSubstituto = substituto;
//                    substituto = substituto.getDireita();
//                }
//                if (paiAtual != null){
//                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
//                        paiAtual.setEsquerda(substituto);
//                    }else{
//                        paiAtual.setDireita(substituto);
//                    }
//                }else{ //se for a raiz
//                    this.raiz = substituto;
//                }
//                
//                //removeu o elemento da árvore
//                if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1){ //substituto < paiSubstituto
//                    paiSubstituto.setEsquerda(null);
//                }else{
//                    paiSubstituto.setDireita(null);
//                }
//            }else{ //não tem filho
//                if (paiAtual != null){
//                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
//                        paiAtual.setEsquerda(null);
//                    }else{
//                        paiAtual.setDireita(null);
//                    }
//                }else{ //é a raiz
//                    this.raiz = null;
//                }
//            }
//            
//            return true;
//        }else{
//            return false;
//        }        
//    }
//}
//
