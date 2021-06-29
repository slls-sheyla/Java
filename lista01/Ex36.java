package lista01;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double altura, raio, v, pi = 3.141592;
		
		System.out.println("Digite a altura de um cilindro:");
		altura = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o raio de um cilindro:");
		raio = Double.parseDouble(in.nextLine());
		
		v = pi * (raio * raio) * altura;
		
		System.out.printf("O volume do cilindro é: %.2f", v);
		
		in.close();
	}

}