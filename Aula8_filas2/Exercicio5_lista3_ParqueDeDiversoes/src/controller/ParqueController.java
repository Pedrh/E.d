package controller;

import model.Fila;

public class ParqueController {
	Pessoa proximo = new Pessoa();
	Fila<Pessoa> fila;
	public ParqueController() {
		super();
	}
	
	public void brinquedo(Fila<Pessoa> fila) {
		try {
		while(!fila.isEmpty()) {
			proximo = fila.remove();
			if(proximo.Idade <= 16) {
				System.out.println(proximo.Nome+ " não pode brincar por não ter a idade necessária. Idade da crinça: " + proximo.Idade);
			}else if(proximo.Altura <= 1.60) {
				System.out.println(proximo.Nome+ " não pode brincar por não ter a altura necessária. Altura da criança: " + proximo.Altura);
			} else {
				System.out.println(proximo.Nome+ "  brincou no Boomerang");
			}
		}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
