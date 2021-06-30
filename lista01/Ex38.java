package lista01;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Digite o salário:");
		salario = Double.parseDouble(in.nextLine());
		
		salario = salario + (salario * 0.25);
		
		System.out.println("O novo salário com 25% de aumento é: R$" + salario );
		
		in.close();
	}
	
}