package controller;

public class MdcController {

	public MdcController() {
		super();
	}
	
	public int MDC(int x, int y) {
		//condi��o de sa�da ==> quando x = y
		if(x == y) {
			return x;
		}
		if(x < y) {
			return MDC(y, x); 
		}else {
			int resultado = MDC(x - y, y);
			return resultado;
		}
		/*a fun��o vai chamando a si mesma enquanto subtrai os par�metros at� que 
		ambos sejam iguais (caso n�o sejam de in�cio)*/
	}

}
