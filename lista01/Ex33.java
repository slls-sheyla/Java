package lista01;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int l, a;
		System.out.println("Digite o tamanho de um lado do quadrado:");
		l = in.nextInt();
		a = l * l;
		
		System.out.println("A área do quadrado é: " + a);
		
		in.close();
	}
	
}