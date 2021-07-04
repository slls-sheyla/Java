package ee1;

public class BuscaBinaria {

	public static void main(String[] args) {

		//int[] S = { 1, 6, 7, 12, 15, 20, 22, 25, 26, 27, 31, 37, 39, 44, 49, 56, 58, 60, 64, 67, 69, 74, 77, 80 };

		int[] S = {570, 250, 0, 220, 60, 40, 10, 20, 30, 50, 200, 80, 70, 170, 150, 140, 110, 100, 90, 120, 130, 160, 190, 180, 210, 230, 240, 280, 260, 270, 310, 300, 290, 450, 380, 360, 350, 320, 330, 340, 370, 390, 420, 400, 410, 440, 430, 470, 460, 520, 490, 480, 500, 510, 550, 530, 540, 560, 940, 760, 630, 590, 580, 610, 600, 620, 650, 640, 700, 690, 670, 660, 680, 720, 710, 730, 740, 750, 860, 840, 770, 780, 790, 830, 800, 820, 810, 850, 870, 890, 880, 930, 900, 910, 920, 980, 970, 950, 960, 990};

		int indice = binaria(S, 280);
		System.out.println(indice);
	}

	private static int binaria(int[] s, int x) {
		int meio;
		int inicio, fim;
		inicio = 0;
		fim = s.length - 1;

		while (inicio <= fim) {

			meio = (inicio + fim) / 2;

			if (s[meio] == x) {

				return meio;

			} else if (s[meio] < x) {

				inicio = meio + 1;

			} else if (s[meio] > x) {

				fim = meio - 1;

			}

		}

		return -1;

	}

}