package lista01;

import java.util.Scanner;

public class Ex37 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double valor, desc;
		
		System.out.println("Digite o valor do produto:");
		valor = Double.parseDouble(in.nextLine());
		
		valor = valor - (valor * 0.12);
		
		System.out.println("O valor do produto com desconto de 12% é " + valor);
		
		in.close();
	}

}