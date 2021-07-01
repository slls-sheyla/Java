package lista01;

import java.io.IOException;
import java.util.Scanner;

public class Ex45 {

	public static void main(String[] args) throws IOException {

		//Converter uma letra maiúscula em letra minúscula usando a tabela ASCII

		/*
		 * Exemplo:
		 * a = 97
		 * A = 65
		 * 65 + 32 = 97
		 */
		
		/*
		 * Lendo um caractere usando o método read() do pacote de classes System.in:
		 */
		
		Scanner in = new Scanner(System.in);
		
		char c, min;
		
		System.out.println("Digite uma letra");
		c = (char)System.in.read();
		min = (char) (c + ' ');
		
		System.out.println(min);

		in.close();

	}

}