package libQuickSort;

public class QuickSort<T extends Comparable<T>> {

	public QuickSort() {
		super();
	}
	
	public T[] quicksort(T[] vetor, int inicio, int fim) {
		if(inicio < fim) {
			int posicaoPivoFixo = ordenar(vetor, inicio, fim);
			//dividir o vetor em dois
			quicksort(vetor, posicaoPivoFixo+1 , fim); //subvetor da direita
			quicksort(vetor, inicio, posicaoPivoFixo-1); // subvetor da esquerda
		}
		return vetor;
	}
	
	private int ordenar(T vetor[], int inicio, int fim) {
			T pivo = vetor[inicio];
			int ponteiroEsquerda = inicio + 1;
			int ponteiroDireita = fim;
			
			while(ponteiroEsquerda < ponteiroDireita) {
				while(ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda].compareTo(pivo) <= 0 ) {
					ponteiroEsquerda++;
				}
				while(ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroDireita].compareTo(pivo) > 0) {
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
	
	private void troca(T[] vetor, int i, int j) {
		T aux = vetor[i]; 
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}

}
