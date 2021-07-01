package lista01;

import java.util.Scanner;

public class Ex46 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n;
		String num;

		System.out.println("Digite um número inteiro de três dígitos:");
		n = in.nextInt();

		// Convertendo para String
		num = Integer.toString(n);

		if (num.length() == 3) {

			for (int i = 2; i >= 0; i--) {

				System.out.print(num.charAt(i));

			}

		}

		in.close();

	}

}