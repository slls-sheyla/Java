package lista01;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double m, h;
		
		System.out.println("Digite a área em metros quadrados:");
		m = Double.parseDouble(in.nextLine());
		h = m * 0.0001;
		
		System.out.println("A área convertida em hectares é: " + h);
		
		in.close();
	}
	
}