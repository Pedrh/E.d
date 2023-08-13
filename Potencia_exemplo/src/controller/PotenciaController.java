package controller;

public class PotenciaController {
	public PotenciaController() {
		super();
	}
	
	public int  potencia(int base, int expoente) {
		//condi  o de parada
		if(expoente == 0) {
			return 1;
		}else {
			expoente = expoente - 1;
			return base * potencia(base, expoente);
		}
	}
}
