package view;

import controller.MenorController;

public class principal {

	public static void main(String[] args) {
		MenorController mc = new MenorController();
		int[] vetor = {3,5,41,6,24,8,1,75,6};
		int i = vetor.length - 1;
		int menor = vetor[i];
		
		int resultado = mc.Menor(vetor, i, menor);
		System.out.println(resultado);
	}

}
