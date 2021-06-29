package lista01;

import java.util.Scanner;

public class Ex21 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double l, k;
		
		System.out.println("Digite um valor de massa em libras:");
		l = Double.parseDouble(in.nextLine());
		k = l * 0.45;
		
		System.out.println("O resultado da conversão para quilogramas é: " + k);
		
		in.close();
	}

}