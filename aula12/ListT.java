import java.util.*;

public class ListT {

	public static void main(String[] args) {
		int [] vetor = new int [103];

		Set<Integer> numeros = new TreeSet<Integer>();
		

		Random rand = new Random();
		//Vamos sortear x n�meros de 0 at� 100 sem repeti��o
		while (numeros.size() < vetor.length) {
		numeros.add(rand.nextInt(101));
		}
		
		System.out.println("N�meros gerados: " + numeros);

	}

}
