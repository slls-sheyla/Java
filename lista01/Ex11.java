package lista01;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double m, km;
		
		System.out.println("Digite uma velocidade em m/s:");
		m = Double.parseDouble(in.nextLine());
		km = m * 3.6;
		
		System.out.println("A velocidade em km/h é: " + km);
		
		in.close();
	}
	
}