package controller;

import fateczl.Lista.model.Lista;
@SuppressWarnings("unchecked")
public class DivideVetor {
	Lista<Integer>[] lista;
	
	
	public DivideVetor() {
		lista = new Lista[2];
		inicializaLista();
	}


	private void inicializaLista() {
		int tamanho = lista.length;
		for(int i = 0; i < tamanho; i++) {
			lista[i] = new Lista<>();
		}
	}


	public int hashCode(int numero) {
		int posicao = numero % 2;
		return posicao;
	}

	
	public void adicionaNumero(int num) {
		int posicao = hashCode(num);
		lista[posicao].addFirst(num);
	}
	
	public void mostraLista() throws Exception {
		int tamanhoLista = lista.length;
		for(int posicao = 0; posicao < tamanhoLista; posicao++) {
			int tamanho = lista[posicao].size();
			System.out.print("lista[" + posicao + "]");
			for(int i = 0; i < tamanho; i++) {
				int valor = lista[posicao].get(i);
				System.out.print("--> " + valor);
			}
			System.out.print("-->Null\n");
		}
	}
	
}
