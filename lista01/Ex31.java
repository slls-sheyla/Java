package lista01;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num, a, s;
		
		System.out.println("Digite um número inteiro:");
		num = in.nextInt();
		
		a = num - 1;
		s = num + 1;
		
		System.out.println("O antecessor é " + a + " e o sucessor é " + s + ".");
		
		in.close();
	}
	
}