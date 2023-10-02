package view;

import controller.Cliente;
import controller.OperacaoController;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		Fila<Cliente> fila = new Fila<>();
		OperacaoController operacao = new OperacaoController();
		
		for(int i = 0; i <20; i++) {
			String nome = "Cliente" + (i+1);
			int QtdDePecas = (int) (Math.random() * 31) + 20;
			float ValorPecas = (float) (Math.random() * 95.01) + 5;
			
			Cliente cliente = new Cliente(nome, QtdDePecas, ValorPecas);
			fila.insert(cliente);
		}
		
		operacao.caixa(fila);
		
	}

}
