package controller;

public class MultiplicaController {

	public MultiplicaController() {
		super();	
	}
	
	public int multiplica(int a, int b) {
		//condição de parada ==> quando b=1
		if(b == 1) {
			return a;
		}else {
			b -= 1;
			return a + multiplica(a, b);
			/* A função usa um contador b (número de vezes que será multiplicado o "a") e vai reduzindo ele até 1, sempre 
			retornando o a + ele mesmo*/
		}
	}

}
