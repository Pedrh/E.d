package view;

import controller.Separacao;
import fateczl.Lista.model.Lista;
import model.Cliente;

public class Principal {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Separacao separacao = new Separacao();
		Lista<Cliente> listaAntiga = new Lista<>();
		
		for(int i = 0; i < 10000; i++) {
			double saldo = (Math.random() * 1000) + 100;
			Cliente cliente = new Cliente(i, "Cliente "+(i+1), saldo);
			listaAntiga.addFirst(cliente);
		}
		
		try {
		for(int i = 0; i < 10000; i++) {
			separacao.adicionaNovaLista(listaAntiga.get(i));
		}
		
		separacao.mostraLista();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
