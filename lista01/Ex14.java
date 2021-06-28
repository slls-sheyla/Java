package lista01;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int g;
		double r, pi = 3.14;
		
		System.out.println("Digite o ângulo em graus:");
		g = in.nextInt();
		r = g * (pi / 180);
		
		System.out.println("O ângulo em radianos é: " + r);
		
		in.close();
		
	}
	
}