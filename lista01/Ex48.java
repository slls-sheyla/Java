package lista01;

import java.util.Scanner;

public class Ex48 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int s;
		double m, h;
		
		System.out.println("Digite um número inteiro em segundos: ");
		s = in.nextInt();
		
		m = s / 60;
		h = m / 60;
		
		System.out.printf(s + " em horas equivale a %.7f", h);
		System.out.println("\n" + s + " em minutos equivale a " + m);
		System.out.print(s + " segundos");
		
		in.close();
	}
	
}