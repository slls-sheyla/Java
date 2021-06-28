package lista01;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura em graus Kelvin:");
		int k = in.nextInt();
		double c = k - 273.15;
		
		System.out.println("A temperatura em graus Celsius é: " + c);
		
		in.close();
		
	}

}