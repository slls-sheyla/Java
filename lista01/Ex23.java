package lista01;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double m, j;
		
		System.out.println("Digite o comprimento em metros:");
		m = Double.parseDouble(in.nextLine());
		j = m / 0.91;
		
		System.out.println("O comprimento convertido em jardas é: " + j);
		
		in.close();
	}
	
}