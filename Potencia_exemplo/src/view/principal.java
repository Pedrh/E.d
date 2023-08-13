package view;

import controller.PotenciaController;
public class principal {

	public static void main(String[] args) {
		PotenciaController pc = new PotenciaController();
		
		int base = 3;
		int expoente = 4;
		
		int res = pc.potencia(base, expoente);
		System.out.println(res);
	}

}
