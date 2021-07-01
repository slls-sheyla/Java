package lista01;

import java.util.Scanner;

public class Ex47 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n;
		String num;

		System.out.println("Digite um número inteiro de três dígitos:");
		n = in.nextInt();

		// Convertendo para String
		num = Integer.toString(n);

		if (num.length() == 4) {

			for (int i = 0; i < 4; i++) {

				System.out.println(num.charAt(i));

			}

		}

		in.close();

	}

}