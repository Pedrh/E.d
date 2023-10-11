package controller;

public class DigitosController {

	public DigitosController() {
		super();
	}
	
	public int Digitos(int num, int cont) {
		// o número recebido vai ser divido por 10 (reposiciona a vírgula) até se tornar 0,..
		if(num < 1) {
			return cont;
		}else {
			cont++;
			num /= 10;
			return Digitos(num, cont);
			//sempre vai retornar o número recebido com a vírgula mais à esquerda
		}
	}

}
