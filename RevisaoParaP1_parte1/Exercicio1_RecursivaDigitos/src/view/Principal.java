package view;

import controller.DigitosController;

public class Principal {

	public static void main(String[] args) {
		DigitosController digitos = new DigitosController();
		
		int num = 1234567;
		int cont = 0;
		int QtdDigitos = digitos.Digitos(num, cont);
		System.out.println(QtdDigitos);
	}

}
