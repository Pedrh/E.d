package controller;

public class NegativosController {

	public NegativosController() {
		super();	
	}
	public String Negativo(int[] vetor, int n, String negativo) {
		//condição de parada ==> quando N <0
		if(n<0) {
			return negativo;
		}else {
			if(vetor[n] < 0) {
				negativo = negativo + vetor[n] + "; ";	
			}
			n -= 1;
			return Negativo(vetor, n, negativo);
			}
		/*O vetor de índice n vai sendo comparado com o mesmo vetor de índice n - 1 e 
		 será adicionada à uma variável string o valor negativo para dado de saída*/
		}
		
	}
