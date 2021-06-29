package lista01;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double h;
		int m;
		
		System.out.println("Digite a área em hectares:");
		h = Double.parseDouble(in.nextLine());
		m = (int) h * 10000;
		
		System.out.println("A área em metros quadrados é: " + m);
		
		in.close();
	}
	
}