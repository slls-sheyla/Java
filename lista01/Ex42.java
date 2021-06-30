package lista01;

import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double salario, g, i, total;

		System.out.println("Digite o salário-base:");
		salario = Double.parseDouble(in.nextLine());

		g = salario * 0.05;
		i = salario * 0.07;
		total = (salario - i) + g;

		System.out.printf("O salário a receber é %.2f", total);

		in.close();

	}

}