package controller;

import model.Fila;

public class EscalonadorController {

	Fila<Processo> fila;
	Fila<Processo> filaFinal = new Fila<>();
	Processo processoAux = new Processo();

	public EscalonadorController() {
		super();
	}

	public void escalonador(Fila<Processo> fila) {
		while (!fila.isEmpty()) {
			try {
				processoAux = fila.remove();
				if (processoAux.QtdRetornos > 1) {
					processoAux.QtdRetornos--;
					if (processoAux.QtdRetornos > 1) {
						fila.insert(processoAux);
					} else {
						filaFinal.insert(processoAux);
					}
				} else {
					filaFinal.insert(processoAux);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}