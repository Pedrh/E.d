package view;

import br.edu.fateczl.arvore.caractere.ArvoreChar.ArvoreChar;

public class Principal {

	public static void main(String[] args) {
		char[] vet = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};
		
		ArvoreChar arvore = new ArvoreChar();
		for(char i: vet) {
			arvore.insert(i);
		}
		
		arvore.remove('F');
		arvore.remove('U');
		
		try {
			System.out.print("pre ordem: ");
			arvore.prefixSearch();
			System.out.print("\nem ordem: ");
			arvore.infixSearch();
			System.out.print("\npos ordem: ");
			arvore.postfixSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
