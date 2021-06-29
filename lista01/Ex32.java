package lista01;

import java.util.Scanner;

public class Ex32 {

	//A soma do sucessor do triplo do número digitado com o antecessor do dobro do número digitado
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num, triplo, dobro, s, a, soma;
		
		System.out.println("Digite um número inteiro:");
		num = in.nextInt();
		
		triplo = num * 3;
		dobro = num * 2;
		s = triplo + 1;
		a = dobro - 1;
		soma = s + a;
		
		System.out.println("A soma é: " + soma);
		
		in.close();
	}
	
}