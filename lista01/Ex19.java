package lista01;

import java.util.Scanner;

public class Ex19 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double l, m;
		
		System.out.println("Digite um volume em litros:");
		l = Double.parseDouble(in.nextLine());
		m = l / 1000;
		
		System.out.println("O resultado convertido em metros cúbicos é: " + m);
		//System.out.printf("O resultado convertido em metros cúbicos é: %.5f", m);
		
		in.close();
	}

}
