package controller;

import fateczl.Lista.model.Lista;
import model.Cliente;

@SuppressWarnings("unchecked")
public class Separacao {
	Cliente cliente;
	Lista<Cliente>[] listaNova;
	
	public Separacao() {
		listaNova = new Lista[10000];
		incializaLista();
	}

	private void incializaLista() {
		int tamanho = listaNova.length;
		for (int i = 0; i < tamanho; i++) {
			listaNova[i] = new Lista<>();
		}
	}

	public int hashCode(Cliente cliente) {
		int posicao = cliente.numeroConta;
		return posicao;
	}

	public void adicionaNovaLista(Cliente cliente) {
		int posicao = hashCode(cliente);
		listaNova[posicao].addFirst(cliente);
	}
	
	public void mostraLista() throws Exception {
		int tamanhoLista = listaNova.length;
		for(int posicao = 0; posicao < tamanhoLista; posicao++) {
			int tamanho = listaNova[posicao].size();
			System.out.print("lista[" + posicao + "]");
			for(int i = 0; i < tamanho; i++) {
				Cliente clienteAtual = listaNova[posicao].get(i);
				System.out.print("--> " + clienteAtual);
			}
			System.out.print("\n");
		}
	}

}
