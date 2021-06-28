package lista01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura em graus Fahrenheit:");
		int f = in.nextInt();
		double c = 5.0 * (f - 32.0) / 9.0;
		
		System.out.print("A temperatura em graus Celsius é: ");
		System.out.printf("%.5f", c);
		
		in.close();
	}
	
}