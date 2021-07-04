package ee1;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	static int[] mergeSort(int array[]) {

		int v1[], v2[], meio, dir;

		meio = array.length / 2;
		dir = meio + 1;
		v1 = new int[meio];

		if(array.length <= 1) {

			return array;

		} else {

			if(array.length % 2 == 0) {

				v2 = new int[meio];

			} else {

				v2 = new int[dir];

			}

			for(int i = 0; i < meio; i++) {

				v1[i] = array[i];

			}

			for(int j = 0; j < v2.length; j++) {

				v2[j] = array[meio + j];

			}

			v1 = mergeSort(v1);
			v2 = mergeSort(v2);

			array = intercala(v1, v2);

			return array;

		}

	}

	static int[] intercala(int v1[], int v2[]) {

		int tam = v1.length + v2.length;
		int [] array = new int[tam];
		int i = 0, j = 0, x = 0;

		while(x < array.length) {

			if(i < v1.length && j < v2.length) {

				if(v1[i] > v2[j]) {

					array[x] = v2[j];
					j++;

				} else {

					array[x] = 	v1[i];
					i++;
				}

			}

			else if(i < v1.length) {

				array[x] = v1[i];
				i++;

			}

			else if(j < v2.length) {

				array[x] = v2[j];
				j++;

			}

			x++;

		}

		return array;

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

		array_int = mergeSort(array_int);
		imprime(array_int);

		} while(in.hasNextLine());

		in.close();

	}

}