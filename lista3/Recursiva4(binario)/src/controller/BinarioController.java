package controller;

public class BinarioController {

	public BinarioController() {
		super();
	}
	
	public String Bin(String binario, int n) {
		//condi��o de parada ==> quando n == 0
		if(n/2==0) {
			if(n%2 != 0) {
				binario = n%2 + "";
				return binario;
			}else {				
				return binario;
			}
		}else {
			binario = n%2 + "";
			n = n/2;
			return Bin(binario, n)+ binario;
		}
		/* a fun��o faz a concatena��o dos restos da divis�o do n�mero recebido por 2; depois diminui
		o n�mero e retorna a soma da string bin�rio com a pr�pria fun��o
		
		quando n = 4, bin�rio = 0 + "";
		n/2 = 2;
		quando n = 2, bin�rio = 0 + "";
		n/2 = 1;
		quando n = 1, bin�rio = 1 + "";
		n/2 = 0;
		e retorna essa string inversa
		*/
	}

}
