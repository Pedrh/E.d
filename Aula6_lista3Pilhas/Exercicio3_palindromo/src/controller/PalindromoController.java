package controller;

import model.PilhaStrings;

public class PalindromoController {

	public PalindromoController() {
		super();
	}
	
	PilhaStrings p = new PilhaStrings();
	
	public String invertePalavra(String palavra) {
		String[] LetrasdaPalavra = palavra.split("");
		int tamanho = LetrasdaPalavra.length;
		
		for(int i = 0; i < tamanho; i++) {
			p.push(LetrasdaPalavra[i]);
		}
		
		StringBuilder palavraInvertida = new StringBuilder();
		
		for(int i = 0; i < tamanho; i++) {
			try {
				palavraInvertida.append(p.pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return palavraInvertida.toString();
	}
	
	public boolean comparaPalavras(String palavra, String palavraInvertida) {
		return palavra.equals(palavraInvertida);
	}

}
