package libQuickSort;

public class QuickSort {

	public QuickSort() {
		super();
	}
	
	public int[] quicksort(int[] vetor, int inicio, int fim) {
		if(inicio < fim) {
			int posicaoPivoFixo = ordenar(vetor, inicio, fim);
			//dividir o vetor em dois
			quicksort(vetor, posicaoPivoFixo+1 , fim); //subvetor da direita
			quicksort(vetor, inicio, posicaoPivoFixo-1); // subvetor da esquerda
		}
		return vetor;
	}
	
	private int ordenar(int vetor[], int inicio, int fim) {
			int pivo = vetor[inicio];
			int ponteiroEsquerda = inicio + 1;
			int ponteiroDireita = fim;
			
			while(ponteiroEsquerda < ponteiroDireita) {
				while(ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda] <= pivo) {
					ponteiroEsquerda++;
				}
				while(ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroDireita] > pivo) {
					ponteiroDireita--;
				}
				if(ponteiroEsquerda <= ponteiroDireita) {
					troca(vetor, ponteiroEsquerda,ponteiroDireita);
					ponteiroDireita--;
					ponteiroEsquerda++;
				}
			}
			troca(vetor, inicio, ponteiroDireita); 
			
		return ponteiroDireita;
	}
	
	private void troca(int[] vetor, int i, int j) {
		int aux = vetor[i]; 
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}

}
