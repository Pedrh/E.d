package view;

import java.io.IOException;

import controller.ModificacaoCadastroController;

public class Principal {

	public static void main(String[] args) {
		ModificacaoCadastroController modificacaoCadastro = new ModificacaoCadastroController();
		try {
			
			modificacaoCadastro.novoCadastro(41, 60, 8000.00);
			modificacaoCadastro.novoCadastro(31, 40, 5000.00);
			modificacaoCadastro.novoCadastro(21, 30, 3000.00);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
