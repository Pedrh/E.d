package controller;

public class MultiplicaController {

	public MultiplicaController() {
		super();	
	}
	
	public int multiplica(int a, int b) {
		//condi��o de parada ==> quando b=1
		if(b == 1) {
			return a;
		}else {
			b -= 1;
			return a + multiplica(a, b);
			/* A fun��o usa um contador b (n�mero de vezes que ser� multiplicado o "a") e vai reduzindo ele at� 1, sempre 
			retornando o a + ele mesmo*/
		}
	}

}
