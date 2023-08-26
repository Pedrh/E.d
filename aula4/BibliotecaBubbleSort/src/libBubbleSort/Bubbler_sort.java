package libBubbleSort;

public class Bubbler_sort {

	public Bubbler_sort() {
		super();
	}
	
	public int[] ordenacao(int[] vetor, int tamanho) {
		for(int i=0; i < tamanho; i++) {
			for(int j=0; j< tamanho; j++) {
				if(vetor[j] > vetor[j+1]) {
					int aux = vetor[j+1];
					vetor[j+1] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		return vetor;
	}

}
