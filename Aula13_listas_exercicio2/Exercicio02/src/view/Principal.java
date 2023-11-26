package view;

import br.edu.fateczl.arvore.inteiro.ArvoreInt.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		int[] vet = {12, 16, 4, 8, 2, 6};
		ArvoreInt arvore = new ArvoreInt();
		
		for(int i:vet) {
			arvore.insert(i);
		}
		
		try {
			arvore.search(6);
			
			arvore.remove(12);
			System.out.println("\nAtravessamento pos ordem após a remoção do valor 12:");
			arvore.postfixSearch();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
