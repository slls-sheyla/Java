package lista01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double real, quintaP;
		
		System.out.println("Digite um número real:");
		real = Double.parseDouble(in.nextLine());
		quintaP = real / 5;
		
		System.out.println(quintaP);
		
		in.close();
		
	}
	
}