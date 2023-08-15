package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	
	public int Fatorial(int n) {
		//condição de parada ==> quando n =1
		if(n==1) {
			return n;
		}else {
			return n * Fatorial(n - 2);
			/* a função retorna a multiplicação do número recebido * o mesmo número decrescido 2 ex:
			5 * (5 - 2 == 3)
			3 * (3 - 2 == 1)*/
		}
	}

}
