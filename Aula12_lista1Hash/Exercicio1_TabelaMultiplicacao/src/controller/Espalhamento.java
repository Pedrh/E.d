package controller;

import fateczl.Lista.model.Lista;
@SuppressWarnings("unchecked")
public class Espalhamento {

		Lista<Integer>[] lista;
		
		
		public Espalhamento(){
			lista = new Lista[100];
			inicializaLista();
		}

		private void inicializaLista() {
			int tamanho = lista.length;
			for(int i = 0; i < tamanho; i++) {
				lista[i] = new Lista<>();
			}
		}

		public int hashCode(int numero) {
			int posicao = (int) (100 * ((((Math.sqrt(7) - 1)/2) * numero) % 1));
			return posicao;
		}
		
		public void adicionaValor(int valor) {
			int posicao = hashCode(valor);
			lista[posicao].addFirst(valor);
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
