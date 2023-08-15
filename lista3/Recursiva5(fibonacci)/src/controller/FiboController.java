package controller;

public class FiboController {

	public FiboController() {
		super();
	}
	
	public int  Fib(int n) {
		//condição de parada ==> Quando o contador for igual ao número recebido. se for 1 ou 2 retorna 1. Senão retorna fib(n -1) + fib(n -2)
		if(n==1 || n==2) {
			return 1;
		}else {
			return Fib(n - 1) + Fib(n - 2);
		}
		/*n = 5
		 Fib(5-1=4) + Fib(5-2=3)
		 Fib(4-1=3) + Fib(4-2=2)
		 Fib(3-1=2) + Fib(3-2=1)*/
	}

}
