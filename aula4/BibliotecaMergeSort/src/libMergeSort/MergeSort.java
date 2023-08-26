package libMergeSort;

public class MergeSort {

	public MergeSort() {
		super();
	}

	public int[] ordenacao(int[] vetor, int inicio, int fim) {

		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			ordenacao(vetor, inicio, meio);
			ordenacao(vetor, meio + 1, fim);
			intercala(vetor, inicio, meio, fim);
		}
		return vetor;

	}

	private int[] intercala(int[] vetor, int inicio, int meio, int fim) {
		int[] novoVetor = new int[vetor.length];
		for (int i = inicio; i <= fim; i++) {
			novoVetor[i] = vetor[i];
		}
		int ponteiroEsquerdo = inicio;
		int ponteiroDireito = meio + 1;
		
		for (int cont = inicio; cont <= fim; cont++) {
			

			if (ponteiroEsquerdo > meio) {
				vetor[cont] = novoVetor[ponteiroDireito];
				ponteiroDireito++;
			} else if (ponteiroDireito > fim) {
				vetor[cont] = novoVetor[ponteiroEsquerdo];
				ponteiroEsquerdo++;
			} else if (novoVetor[ponteiroEsquerdo] < novoVetor[ponteiroDireito]) {
				vetor[cont] = novoVetor[ponteiroEsquerdo];
				ponteiroEsquerdo++;
			} else {
				vetor[cont] = novoVetor[ponteiroDireito];
				ponteiroDireito++;
			}
		}

		return vetor;
	}

}
