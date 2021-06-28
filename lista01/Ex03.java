package lista01;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n1, n2, n3, soma;
		
		System.out.println("Digite três números inteiros:");
		n1 = in.nextInt();
		n2 = in.nextInt();
		n3 = in.nextInt();
		
		soma = n1 + n2 + n3;
		
		System.out.println("A soma dos números digitados é: " + soma);
		
		in.close();
		
	}

}
