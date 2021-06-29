package lista01;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double r, g, pi = 3.14;
		
		System.out.println("Digite um ângulo em radianos:");
		r = Double.parseDouble(in.nextLine());
		g = r * (180 / pi);
		
		System.out.printf("O ângulo em graus é: %.3f", g);
	
		in.close();
		
	}
	
}