package lista01;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double p, c;
		
		System.out.println("Digite o comprimento em polegadas:");
		p = Double.parseDouble(in.nextLine());
		c = p * 2.54;
		
		System.out.println("O comprimento em cm é: " + c);
		
		in.close();
	}
	
}