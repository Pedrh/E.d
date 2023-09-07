package controller;

import model.pilhaInt;

public class ConverteController {
	pilhaInt p = new pilhaInt();
	
	public ConverteController() {
		super();
	}
	
	public void ConverteController(int valor) throws Exception {
		decToBin(valor);
		System.out.print("Número " + valor + " em binário:");
		do {
			String ValorFinal = p.pop() + "";
			System.out.print(ValorFinal);
		}while(!p.isEmpty());
	}

	public String decToBin(int valor) {
		if (valor / 2 == 0) {
			if (valor % 2 != 0) {
				p.push(valor % 2);
				return valor + "";
			} else {
				return valor + "";
			}

		} else {
			p.push(valor % 2);
			valor = valor / 2;
			return decToBin(valor) + valor;
		}
	}
}
