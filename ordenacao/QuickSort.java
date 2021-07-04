package ee1;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	private static void quickSort(int array[], int i, int j) {
		
		if (i < j) {
			
			int principal = particiona(array, i, j);
			quickSort(array, i, principal - 1);
			quickSort(array, principal + 1, j);
		
		}
	
	}

	private static int particiona(int array[], int ini, int fim) {
	
		int pivo = array[ini];
		int i = ini;
		i++;
		
		while (i <= fim) {
			
			if (array[i] <= pivo)
			
				i++;
			
			else if (array[fim] > pivo )
				
				fim--;
			
			else {
			
				int aux = array[i];
				array[i] = array[fim];
				array[fim] = aux;
				i++;
				fim--;
			
			}

		}
		
		array[ini] = array[fim];
		array[fim] = pivo;
		
		return fim;
	}

	private static void imprime(int [] array) {

		System.out.print("[");
		int i;
		for (i = 0; i < array.length-1; i++) {

			System.out.print(array[i] + ", ");

		}

		System.out.print(array[i]);
		System.out.println("]");
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String n;
		String [] array;
		String entrada;
		int[] array_int;

		do {

			n = in.nextLine();

			entrada = in.nextLine();
			array = entrada.replace("|", ",").split(",");
			array_int = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();

			int i = 0, fim = array_int.length - 1;
			
			quickSort(array_int, i, fim);
			imprime(array_int);

		} while(in.hasNextLine());

		in.close();

	}

}
