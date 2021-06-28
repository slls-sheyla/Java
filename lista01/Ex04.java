package lista01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Digite um número real:");
		double real, quadrado;
		real = Double.parseDouble(in.nextLine());
		quadrado = real * real;

		System.out.println(quadrado);

		in.close();

	}

}