package controller;

import fateczl.Lista.model.Lista;
import model.Chocolate;
@SuppressWarnings("unchecked")

public class CalculaChocolate {

	Lista<Chocolate>[] lista;
	
	
	public CalculaChocolate() {
		lista = new Lista[5];
		inicializaLista();
	}

	private void inicializaLista() {
		int tamanho = lista.length;
		for(int i = 0; i < tamanho; i++) {
			lista[i] = new Lista<>();
		}
	}
	
	
	private Chocolate calculaDados(Chocolate chocolate) throws Exception {
		try {
			chocolate.volume = chocolate.altura * chocolate.comprimento * chocolate.largura;
			if(chocolate.volume >= 50 && chocolate.volume <= 60) {
				chocolate.gramas = 60;
				chocolate.receita = "Fazer bombons";
			}else if(chocolate.volume >= 100 && chocolate.volume <= 110) {
				chocolate.gramas = 115;
				chocolate.receita = "Fazer pavê";
			}else if(chocolate.volume >= 150 && chocolate.volume <= 165) {
				chocolate.gramas = 160;
				chocolate.receita = "Fazer brigadeiros";
			}else if(chocolate.volume >= 200 && chocolate.volume <= 220) {
				chocolate.gramas = 215;
				chocolate.receita = "Fazer bolo";
			}else if(chocolate.volume >= 260 && chocolate.volume <= 280) {
				chocolate.gramas = 280;
				chocolate.receita = "Fazer ovo de páscoa";
			}else {
				System.err.println("Não foi possível definir as gramas e a receita");
			}
		}catch(Exception e) {
			e = new Exception("Algumas medidas não foram encontradas");
		}
		return chocolate;
	}
	
	public void adicionaChocolate(Chocolate chocolate) throws Exception {
		try {
		chocolate = calculaDados(chocolate);
		int posicao = chocolate.hashCode();
		lista[posicao].addLast(chocolate); 
		System.out.println("-------------------- \nChocolate adicionado à lista! Seus dados: \n" + chocolate.toString());
		}catch(Exception e) {
		}
	}
	
	public void encontraChocolate(Chocolate chocolate) throws Exception {
		chocolate = calculaDados(chocolate);
		int posicao = chocolate.hashCode();
		int tamanho = lista[posicao].size();
		boolean isFound = false;
		
		for(int i =0; i < tamanho; i++) {
			Chocolate chocoAtual = lista[posicao].get(i);
			if(chocoAtual.altura == chocolate.altura && chocoAtual.comprimento == chocolate.comprimento && chocoAtual.largura == chocolate.largura) {
				System.out.println(chocoAtual.toString());
				isFound = true;
				break;
			}
				
		}
		
		if(!isFound) {
			System.err.println("Chocolate não encontrado");
		}
	}
	
}
