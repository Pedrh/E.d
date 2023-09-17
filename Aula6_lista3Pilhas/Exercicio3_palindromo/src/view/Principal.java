package view;

import javax.swing.JOptionPane;

import controller.PalindromoController;

public class Principal {

	
	public static void main(String[] args) {
		PalindromoController palindromo = new PalindromoController();
		
		String palavra = JOptionPane.showInputDialog("Digite uma palavra que pode ser palindromo: ");
		String palavraInvertida = palindromo.invertePalavra(palavra);
		
		boolean ePalindromo = palindromo.comparaPalavras(palavra, palavraInvertida);
		
		if(ePalindromo) {
			System.out.println("Essa palavra � um palindromo");
		}else {
			System.out.println("Essa palavra n�o � um palindromo");
		}
	}

}
