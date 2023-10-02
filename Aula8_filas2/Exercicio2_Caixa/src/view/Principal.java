package view;

import controller.OperacaoController;
import controller.Cliente;
import model.Fila;
public class Principal {
	
	public static void main(String[] args) {
		Cliente cliente;
		Fila<Cliente> fila = new Fila<>();
		System.out.println(fila.size());
		
		String[] vetorNomes = {"Giovana", "Marcia", "Ronaldo", "Pietro", "Lucas", "Maria", "Bia", "Jô", "Cleiton", "Rosivaldo", "Claudio", "João", "Luiza", "ketlyn", "Joana", "Osvaldo", "tati", "Leandro", "Carlos", "Antonio"};
		
		for(int i=0; i < 20; i++) {
			cliente = new Cliente();
			cliente.Nome = vetorNomes[i];
			cliente.QuantidadePecas = (int) (Math.random() * 31) + 20;
			cliente.ValorPecas = (float) (Math.random() * 95.05) + 5;	
			
			fila.insert(cliente);
		}
		
		OperacaoController operacao = new OperacaoController();
		while(!fila.isEmpty()) {
			try {
				operacao.caixa(fila);
				fila.remove();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}