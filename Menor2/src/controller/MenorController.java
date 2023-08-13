package controller;

public class MenorController {
	public MenorController() {
		super();
	}

	public int Menor(int[] vetor, int i, int menor) {
		// condição de parada ==> quando o �ndice i == 0
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
		/*retorna*/
	}
}
