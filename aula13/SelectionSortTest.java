import java.util.Scanner;

public class SelectionSortTest {
	private static Scanner entrada;
	public static void main(String[] args) {
		int num;
		//SelectionSortClasse s = new SelectionSortClasse ();
		//s.SemRepitir();
				//s.Desodenado();
				//s.SelectionSort();
				//s.Ordenado();
		SelectionSortClasse2<Integer> ss = new SelectionSortClasse2<Integer> ();
		entrada = new Scanner(System.in);
		
		System.out.print("Digite  Numero: " );
	//ss.n=entrada.nextInt();
		num=entrada.nextInt();
		ss.setN(num);
		ss.Selecao();
	
	}

}
