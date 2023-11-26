package view;

import br.edu.fateczl.arvore.inteiro.ArvoreInt.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		int[] vet = {33, 15, 41, 38, 47, 34, 49, 43};
		
		ArvoreInt arvore = new ArvoreInt();
		
		for(int i: vet) {
			arvore.insert(i);
		}
		
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
