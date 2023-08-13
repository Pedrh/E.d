package view;

import controller.NegativosController;
public class Principal {

	public static void main(String[] args) {
		NegativosController nc = new NegativosController();
		int vetor[] = {2, -4, 5, 6, -1, -16};
		int n = vetor.length - 1;
		String negativos = "";
		
		String resultado = nc.Negativo(vetor, n, negativos);
		System.out.println(resultado);
	}

}
