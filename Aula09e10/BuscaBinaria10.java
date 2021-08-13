import java.util.Scanner;

public class BuscaBinaria10 {

	public static void main(String[] args) {
		int [] vetor = new int [100];
		
		for(int i=0;i<vetor.length;i++) {
			vetor[i] =i*2;
			System.out.println(vetor[i]);
		}
	
		System.out.println("Qual numero vc busca?");
		Scanner leitor = new Scanner(System.in);
		int buscado = leitor.nextInt();
		
		int contador=0;
		boolean achou=false;
		int inicio =0;
		int fim = vetor.length -1;
		int meio;
		while(inicio <=fim) {
			meio = (int)((inicio+fim )/2);
			contador++;//quantas busca ele fez
			if(vetor[meio]==buscado) {
				achou=true;

				break;
			}else if (vetor[meio]<buscado) {
				inicio = meio +1;
			}else {//so pode ser maior
				fim = meio -1;
			}
		}
		System.out.print("Quantidade de teste: "+contador);

		if(achou) {
			System.out.println("\nAchou");
		}else {
			System.out.println("\nNao Achou");
		}
		
		
		
		
		

	}

}
