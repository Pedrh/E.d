package controller;

public class BinarioController {

	public BinarioController() {
		super();
	}
	
	public String Bin(String binario, int n) {
		//condição de parada ==> quando n == 0
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
		/* a função faz a concatenação dos restos da divisão do número recebido por 2; depois diminui
		o número e retorna a soma da string binário com a própria função
		
		quando n = 4, binário = 0 + "";
		n/2 = 2;
		quando n = 2, binário = 0 + "";
		n/2 = 1;
		quando n = 1, binário = 1 + "";
		n/2 = 0;
		e retorna essa string inversa
		*/
	}

}
