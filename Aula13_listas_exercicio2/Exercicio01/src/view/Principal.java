package view;

import br.edu.fateczl.arvore.inteiro.ArvoreInt.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		int[] vet = {30, 15, 60, 10, 20, 40, 80};
		ArvoreInt arvore = new ArvoreInt();
		
		for(int i:vet) {
			arvore.insert(i);
		}
		
		try {
			System.out.print("Busca em ordem crescente: em ordem { ");
			arvore.infixSearch();
			System.out.print("}");
			
			arvore.remove(60);
			System.out.print("\nApós a remoção do 60: { ");
			arvore.infixSearch();
			System.out.print("}");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
