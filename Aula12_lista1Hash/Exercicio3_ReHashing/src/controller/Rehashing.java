package controller;

import fateczl.Lista.model.Lista;
@SuppressWarnings("unchecked")
public class Rehashing {
	Lista<Integer>[] listaNova;
	
	
	public Rehashing() {
		listaNova = new Lista[5];
		incializaLista();
	}


	private void incializaLista() {
		int tamanho = listaNova.length;
		for(int i = 0; i < tamanho; i++) {
			listaNova[i] = new Lista<>();
		}
	}
	
	
	
	
	public int hashCode(int valor) {
		int posicao = valor % 5;
		return posicao;
	}

	
	
	public void adicionaNovaLista(int valor) {
		int posicao  = hashCode(valor);
		listaNova[posicao].addFirst(valor);
	}
	
	public void mostraLista() throws Exception {
		int tamanhoLista = listaNova.length;
		for(int posicao = 0; posicao < tamanhoLista; posicao++) {
			int tamanho = listaNova[posicao].size();
			System.out.print("lista[" + posicao + "]");
			for(int i = 0; i < tamanho; i++) {
				int valor = listaNova[posicao].get(i);
				System.out.print("--> " + valor);
			}
			System.out.print("-->Null\n");
		}
	}
	
}
