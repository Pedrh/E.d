package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	
	public int Fatorial(int n) {
		//condi��o de parada ==> quando n =1
		if(n==1) {
			return n;
		}else {
			return n * Fatorial(n - 2);
			/* a fun��o retorna a multiplica��o do n�mero recebido * o mesmo n�mero decrescido 2 ex:
			5 * (5 - 2 == 3)
			3 * (3 - 2 == 1)*/
		}
	}

}
