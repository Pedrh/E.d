package view;

import controller.ParqueController;
import model.Fila;
import controller.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Fila<Pessoa> fila = new Fila<>();
		ParqueController parque = new ParqueController();
		
		for(int i = 0; i < 30; i++) {
			int idade = (int) (Math.random() * 31) + 10;
			float altura = (float) ((Math.random() * 0.76) + 1.35);
			String nome = "Pessoa" + (i+1);
			Pessoa pessoa = new Pessoa(nome, idade, altura);
			fila.insert(pessoa);
		}
		
		parque.brinquedo(fila);
	}

}
