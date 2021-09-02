
public class radix {
	 // Usando a classificação por contagem para classificar os elementos com base em lugares significativos
	  void countingSort(int array[], int size, int place) {
	    int[] output = new int[size + 1];
	    int max = array[0];
	    for (int i = 1; i < size; i++) {
	      if (array[i] > max)
	        max = array[i];
	    }
	    int[] count = new int[max + 1];

	    for (int i = 0; i < max; ++i)
	      count[i] = 0;

	    // Calcule a contagem de elementos
	    for (int i = 0; i < size; i++)
	      count[(array[i] / place) % 10]++;

	    // Calcular a contagem cumulativa
	    for (int i = 1; i < 10; i++)
	      count[i] += count[i - 1];

	    // Coloque os elementos em ordem de classificação
	    for (int i = size - 1; i >= 0; i--) {
	      output[count[(array[i] / place) % 10] - 1] = array[i];
	      count[(array[i] / place) % 10]--;
	    }

	    for (int i = 0; i < size; i++)
	      array[i] = output[i];
	  }

	   // Função para obter o maior elemento de uma matriz
	 static int getMax(int array[], int n) {
	    int max = array[0];
	    for (int i = 1; i < n; i++)
	      if (array[i] > max)
	        max = array[i];
	    return max;
	  }

	  // Função principal para implementar classificação raiz
	 void radixSort(int array[], int size) {
	    // Get maximum element
	    int max = getMax(array, size);

	    // Aplique classificação por contagem para classificar os elementos com base no valor local.
	    for (int place = 1; max / place > 0; place *= 10)
	      countingSort(array, size, place);
	  }
	

}
