package ee1;

public class SelectionSort {

	void SelectionSort(int vetor[], int tam) {
	    for (int indice = 0; indice < tam; ++indice) {
	        int indiceMenor = indice;
	        for (int indiceSeguinte = indice+1; indiceSeguinte < tam; ++indiceSeguinte) {
	            if (vetor[indiceSeguinte] < vetor[indiceMenor]) {
	                indiceMenor = indiceSeguinte;
	            }
	        }
	        int aux = vetor[indice];
	        vetor[indice] = vetor[indiceMenor];
	        vetor[indiceMenor] = aux;
	    }
	}
	
}
