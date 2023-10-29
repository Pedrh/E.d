package controller;

import fateczl.Lista.model.Lista;
import model.Morador;
@SuppressWarnings("unchecked")

public class PortariaController {

	Lista<Morador>[] listaApto;
	
	
	public PortariaController() {
		listaApto = new Lista[10];
		inicializarLista();
	}


	private void inicializarLista() {
		int tamanho = listaApto.length;
		for(int i = 0; i < tamanho; i++) {
			listaApto[i] = new Lista<>();
		}
	}
	
	public void cadastraMorador(Morador morador) throws Exception {
		int posicao = morador.hashCode();
		listaApto[posicao].addLast(morador);
		System.out.println("Morador adicionado");
	}
	
	public void consultaMorador(Morador morador) throws Exception {
		int posicao = morador.hashCode();
		int tamanho = listaApto[posicao].size();
		boolean moradorEncontrado = false;
		for(int i = 0; i < tamanho; i++) {
			Morador moradorDaVez = listaApto[posicao].get(i);
			if(morador.nome == moradorDaVez.nome) {
				System.out.println("\n"+moradorDaVez.toString());
				moradorEncontrado = true;
				break;
			}
			
		}
		if(!moradorEncontrado) {
			System.err.println("Morador não encontrado");
		}
		
	}
	
	public void excluirMorador(Morador morador) throws Exception {
		int posicao = morador.hashCode();
		int tamanho = listaApto[posicao].size();
		
		for(int i = 0; i < tamanho; i++) {
			Morador moradorDaVez = listaApto[posicao].get(i);
			if(morador.nome == moradorDaVez.nome) {
				listaApto[posicao].remove(i);
				System.out.println("Morador removido");
				break;
			}
		}
	}
	
}
