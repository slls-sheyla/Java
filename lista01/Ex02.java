package lista01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número real:");
		double real = Double.parseDouble(input.nextLine());
		System.out.println(real);

		input.close();
		
	}

}