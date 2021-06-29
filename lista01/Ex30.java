package lista01;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double r, d, v_dolar;
		
		System.out.println("Digite o valor em real: ");
		r = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a cotação do dolár: ");
		d = Double.parseDouble(in.nextLine());
		
		v_dolar = r * d;
		
		System.out.printf("O valor correspondente em dólares é: %.2f", v_dolar);
		
		in.close();
	}
	
}