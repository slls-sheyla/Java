package ee1;

public class BubbleSort {

	static void bubbleSort(int array[]){

		boolean trocado = false;
		int aux = 0;
		
		do {

			for (int i = 0; i < array.length - 2; i++) {

				if (array[i] > array[ i + 1 ]) {

					aux = array[i];
					array[i] = array[i+1];
					array[i+1] = aux;
					trocado = true;

				}	
			}

		} while (trocado != true);

	}
}
