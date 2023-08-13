package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	
	public int fatorial(int n) {
		//condição de parada ==> quando n=1
		if(n==1) {
			return 1;
		}else {
			return n * fatorial(n -1);
		/*O valor de n vai ser multiplicado pelo mesmo valor descrescido 1 até que 
		  n tenha o valor de 1*/
		}
	}
}
