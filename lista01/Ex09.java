package lista01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura em graus Celsius:");
		int c = in.nextInt();
		double k = c + 273.15;
		
		System.out.println("A temperatura em graus Kelvin é: " + k);
		
		in.close();
	}
	
}