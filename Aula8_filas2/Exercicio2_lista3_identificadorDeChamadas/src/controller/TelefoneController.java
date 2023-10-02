package controller;

import model.Fila;

public class TelefoneController {

	public Fila<String> fila;
	public Fila<String> filaAux = new Fila<>();
	
	public TelefoneController() {
		super();
	}
	
	public void insereLigacao(Fila<String> fila, String numeroTelefone) {
		fila.insert(numeroTelefone);
		System.out.println("Número "+ numeroTelefone + " adicionado");
	}
	
	public void consultaLigacao(Fila<String> fila) throws Exception {
		if(fila.isEmpty()) {
			throw new Exception("Não existem ligações");
		}else {
			while(!fila.isEmpty()) {
				String num = fila.remove();
				System.out.println(num);
				filaAux.insert(num);
			}
			
			while(!filaAux.isEmpty()) {
				String num = filaAux.remove();
				fila.insert(num);
			}
		}
	}

}
