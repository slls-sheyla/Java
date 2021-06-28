package lista01;

import java.util.Scanner;

public class Ex06 {
	
	//Convertendo a temperatura de graus Celsius para Fahrenheit
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura em graus Celsius:");
		int c = in.nextInt();		
		double f = c * (9.0 / 5.0) + 32.0;
		
		System.out.println("A temperatura em Fahrenheit é: " + f);
		
		in.close();
		
	}

}