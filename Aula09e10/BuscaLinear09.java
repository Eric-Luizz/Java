import java.util.Scanner;

public class BuscaLinear09 {

	public static void main(String[] args) {
		int [] vetor = new int [8];
		for(int i=0;i<vetor.length;i++) {
			vetor[i] =(int) (Math.random()*20);
			System.out.println(vetor[i]);
		}
		
		System.out.println("Qual numero procura?");
		Scanner leitor = new Scanner(System.in);
		int buscado=leitor.nextInt();
		
		boolean achou = false;
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]==buscado) {
				achou=true;

				break;
			}
			
		}
		if(achou) {
			System.out.println("Achou");
		}else {
			System.out.println("Nao Achou");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
