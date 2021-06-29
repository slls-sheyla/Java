package lista01;

import java.util.Scanner;

public class Ex24 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double m, a;
		
		System.out.println("Digite a área em metros quadrados:");
		m = Double.parseDouble(in.nextLine());
		a = m * 0.000247;
		
		System.out.println("A área convertida em acres é: " + a);
		
		in.close();
	}

}