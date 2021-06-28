package lista01;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double km, m;
		
		System.out.println("Digite uma velocidade em km/h:");
		km = Double.parseDouble(in.nextLine());
		m = km / 3.6;
		
		System.out.print("A velocidade em metros por segundo é: ");
		System.out.printf("%.5f", m);
		in.close();
	
	}

}