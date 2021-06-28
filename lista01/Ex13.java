package lista01;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double m, k;
		System.out.println("Digite uma distância em km:");
		k = Double.parseDouble(in.nextLine());
		m = k / 1.61;
		
		System.out.println("A distância em milhas é: " + m);
		
		in.close();
		
	}
	
}