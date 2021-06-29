package lista01;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double r, a, pi = 3.141592;
		
		System.out.println("Digite o raio do círculo:");
		r = Double.parseDouble(in.nextLine());
		a = pi * (r * r);
		
		System.out.println("A área do círculo é: " + a);
		
		in.close();
	}
	
}