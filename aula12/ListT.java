import java.util.*;

public class ListT {

	public static void main(String[] args) {
		int [] vetor = new int [103];

		Set<Integer> numeros = new TreeSet<Integer>();
		

		Random rand = new Random();
		//Vamos sortear x números de 0 até 100 sem repetição
		while (numeros.size() < vetor.length) {
		numeros.add(rand.nextInt(101));
		}
		
		System.out.println("Números gerados: " + numeros);

	}

}
