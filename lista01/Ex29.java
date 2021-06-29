package lista01;

import java.util.Scanner;

public class Ex29 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double n1, n2, n3, n4, mA;
		
		System.out.println("Digite quatro notas respectivamente:");
		n1 = Double.parseDouble(in.nextLine());
		n2 = Double.parseDouble(in.nextLine());
		n3 = Double.parseDouble(in.nextLine());
		n4 = Double.parseDouble(in.nextLine());
		
		mA = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println("A média aritmética é: " + mA);
		
		in.close();
	}

}