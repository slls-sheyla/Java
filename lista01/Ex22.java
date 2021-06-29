package lista01;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double j, m;
		
		System.out.println("Digite um comprimento em jardas:");
		j = Double.parseDouble(in.nextLine());
		m = 0.91 * j;
		
		System.out.println("O comprimento convertido para metros é: " + m);
		
		in.close();
	
	}
	
}