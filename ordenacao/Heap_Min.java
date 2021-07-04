package ee1;

public class Heap_Min {

	static void min_heap(int array[]) {
		
		int i, pai, esq, dir, aux, altura = 1;
		
		while(altura > 0) {
		
			i = 0; pai = 0; esq = 0; dir = 0; aux = 0;
			
			while(pai < array.length+1) {
	
				pai = i;
				esq = (2 * i) + 1;
				dir = (2 * i) + 2;
	
				if(dir == array.length) {
	
					if(array[esq] < array[pai]) {
						aux = array[esq];
						array[esq] = array[pai];
						array[pai] = aux;
							
					}
	
				}
	
				if((i < (array.length / 2)) && (esq < array.length && dir < array.length)) {
	
					if(array[esq] < array[dir]) {
	
						if(array[esq] < array[pai]) {
							altura++;
							aux = array[esq];
							array[esq] = array[pai];
							array[pai] = aux;
	
						}
	
					} else {
	
						if(array[dir] < array[pai]) {
							aux = array[dir];
							array[dir] = array[pai];
							array[pai] = aux;
	
						}
	
					}
	
				}	
	
				i++;
	
			}
			
			altura--;
		
		}
	
	}

	static void imprime(int array[]) {

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");

		}

	}

	public static void main(String [] args) {

		//certo max e min
		//int array[] = {40, 90, 20, 10, 50, 70, 80};
		//int array2[] = {20,10,40,90,50,70,80};

		//certo max e errado min
		//int array[] = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};

		//certo max e min
		//int array[] = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		//System.out.println(Arrays.equals(array, array2));

		//certo max e min
		//int array[] = {9, 5, 8, 1, 4, 6, 2};
		//int array2[] = {5, 1, 2, 9, 4, 6, 8};
		
		int array[] = {1, 2, 3, 4};

		min_heap(array);		
		imprime(array);

	}

}