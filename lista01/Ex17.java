package lista01;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double c, p;
		
		System.out.println("Digite o comprimento em cm:");
		c = Double.parseDouble(in.nextLine());
		p = c / 2.54;
		
		System.out.printf("O comprimento em polegadas é: %.5f", p);
		
		in.close();
		
	}

}