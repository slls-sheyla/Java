package lista01;

import java.util.Scanner;

public class Ex39 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double p, s, t, valor = 780000;
		t = 1 - (0.46 + 0.32);
		p = valor * 0.46;
		s = valor * 0.32;
		t = valor * t;
		
		System.out.printf("Primeiro ganhador recebeu: %.2f", p);
		System.out.printf("\nSegundo ganhador recebeu: %.2f", s);
		System.out.printf("\nTerceiro ganhador recebeu: %.2f", t);
		
		in.close();
		
	}

}