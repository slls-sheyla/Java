package ee1;

public class Heapsort {
	
	public static void Heapsort(int array[]) {

		int tamanho = array.length;
		int metade = tamanho / 2, pai, filho, t;

		while (true) {

			if (metade > 0) {

				metade--; 
				t = array[metade];

			} else {

				tamanho--;

				if (tamanho <= 0) {
					
					return;
					
				}
				
				t = array[tamanho];
				array[tamanho] = array[0];

			}

			pai = metade;
			filho = ((metade * 2) + 1);

			while (filho < tamanho){

				if ((filho + 1 < tamanho) && (array[filho + 1] > array[filho])) {
					
					filho++;
			
				}
				
				if (array[filho] > t) {

					array[pai] = array[filho];
					pai = filho;
					filho = pai * 2 + 1;

				} else {

					break;

				}
			
			}
			
			array[pai] = t;
		
		}

	}
	
}