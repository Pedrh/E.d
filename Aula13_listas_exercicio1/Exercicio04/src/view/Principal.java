package view;

import br.edu.fateczl.arvore.inteiro.ArvoreInt.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		int[] vet = {7, 8, 3, 4, 2, 1, 6, 5};
		
		ArvoreInt arvore = new ArvoreInt();
		
		for(int i: vet) {
			arvore.insert(i);
		}
		
		arvore.remove(7);
		arvore.remove(6);
		
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
