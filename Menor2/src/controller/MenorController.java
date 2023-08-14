package controller;

public class MenorController {
	public MenorController() {
		super();
	}

	public int Menor(int[] vetor, int i, int menor) {
		// condição de parada ==> quando o índice i == 0
		if (i < 0) {
			return menor;
		}
		if (menor <= vetor[i]) {
			i -= 1;
			return Menor(vetor, i, menor);
		} else {
			menor = vetor[i];
			i -= 1;
			return Menor(vetor, i, menor);
		}
		/*a recursiva determina o menor valor como sendo o último do vetor e faz a checagem com 
		 o mesmo vetor de índice i - 1 até que o índice se torne negativo, e substitui seu valor 
		 caso encontre um número menor */
	}
}
