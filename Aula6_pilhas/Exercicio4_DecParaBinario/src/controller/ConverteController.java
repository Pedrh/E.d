package controller;

import model.PilhaStrings;

public class ConverteController {
	PilhaStrings p = new PilhaStrings();

	public ConverteController() {
		super();
	}

	public void ConverteController(int valor) throws Exception {
		System.out.println("Número " + valor + " em binário: " + decToBin(valor));
	}

	public String decToBin(int valor) {
		if (valor == 0) {
			return "0";
		}
		if (valor == 1) {

			StringBuffer Sbin = new StringBuffer();
			p.push("1");

			try {
				do {
					
					Sbin.append(p.top());
					p.pop();
					
				} while (p != null);
			} catch (Exception e) {

			}

			return Sbin.toString();

		} else {
			String resto = String.valueOf(valor % 2);
			p.push(resto);
			valor = valor / 2;
			return decToBin(valor);
		}
	}
}
