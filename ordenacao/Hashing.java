package ee1;

import java.util.Scanner;

public class Hashing {

	//construir a matriz de sentados, a chave de cadastro 
	static void inserir_hash(int array[][], int k, int f, int q) {

		for(int i = 0; i < f; i++) {

			for(int j = 0; j < q; j++) {

				if(array[i][j] == 0) {
					
					array[i][j] = k;
					i = (f + 1);
					j = (q + 1);
					
				}

				//System.out.print(array[i][j] + " ");
				
			}

			//System.out.println();

		}

	}
	
	static void imprime(int array[][], int m, int c) {

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < c; j++) {
			
				System.out.print(array[i][j] + " ");
				
			}
			
			System.out.println();
		
		}

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int matriz[][] = new int[2][3];
		int k = 8;
		int k2 = 9;
		int k3 = 2;
		int k4 = 3;
		int m = 2;
		int c = 3;
		
		
		inserir_hash(matriz, k, m, c);
		inserir_hash(matriz, k2, m, c);
		inserir_hash(matriz, k3, m, c);
		inserir_hash(matriz, k4, m, c);
		imprime(matriz, m, c);
		
		in.close();
	}

}