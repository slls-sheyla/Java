package lista01;

import java.util.Scanner;

public class Ex43 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		double valor, desc, parc, comA, comP;
		
		System.out.println("Digite o valor total:");
		valor = Double.parseDouble(in.nextLine());
		
		desc = valor - (valor * 0.1);
		parc = valor / 3;
		comA = desc * 0.05;
		comP = valor * 0.05;
		
		System.out.print("O valor total a pagar com 10% de desconto é:");
		System.out.printf(" %.2f", desc);
		System.out.printf("\nO valor de cada parcela em 3x sem juros %.2f", parc);
		System.out.printf("\nA comissão do vendedor, se a venda for a vista %.2f", comA);
		System.out.printf("\nA comissão do vendedor, se a venda for parcelada %.2f", comP);
		
		in.close();
	
	}

}