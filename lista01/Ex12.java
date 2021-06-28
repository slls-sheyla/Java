package lista01;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double m, km;
		System.out.println("Digite uma distância em milhas:");
		m = Double.parseDouble(in.nextLine());
		km = 1.61 * m;
		
		System.out.println("A distância em km/h é: " + km);
		
		in.close();
	}
	
}