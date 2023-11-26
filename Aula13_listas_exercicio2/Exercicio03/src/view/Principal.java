package view;

import br.edu.fateczl.arvore.caractere.ArvoreChar.ArvoreChar;

public class Principal {

	public static void main(String[] args) {
		char[] vet = {'k', 'm', 'd', 'b', 'f', 'l', 't', 'c', 'p', 'z', 'r'};
		ArvoreChar arvore = new ArvoreChar();
		
		for(char i:vet) {
			arvore.insert(i);
		}
		
		try {
			arvore.remove('m');
			
			System.out.print("pre ordem: ");
			arvore.prefixSearch();
			System.out.print("\nem ordem: ");
			arvore.infixSearch();
			System.out.print("\npos ordem: ");
			arvore.postfixSearch();
			
			System.out.print("\nnivel= ");
			arvore.search('r');
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
