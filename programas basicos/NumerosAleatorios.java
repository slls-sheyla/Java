package slls;

import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args) {

		Random random = new Random();
		int numero = random.nextInt(100);
		double numero1 = random.nextDouble() * 10;
		double numero2 = random.nextDouble() * 100;
		
		System.out.println("Número inteiro aleatório de 0 até 100: " + numero);

        System.out.println("Número real aleatório de 0 até 1: " + numero1);

        System.out.println("Número real aleatório de 0 até 10: " + numero2);


		
		
	}

}
