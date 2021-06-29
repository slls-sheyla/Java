package lista01;

import java.util.Scanner;

public class Ex20 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double k, l;
		
		System.out.println("Digite a massa em quilogramas");
		k = Double.parseDouble(in.nextLine());
		l = k / 0.45;
		
		System.out.printf("A massa convertida em libras é: %.4f", l);
		
		in.close();
	}

}