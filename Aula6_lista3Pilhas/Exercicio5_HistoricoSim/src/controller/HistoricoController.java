package controller;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

import model.PilhaStrings;

public class HistoricoController {

	public HistoricoController() {
		super();
	}

	public void inserirEndereco(String endereco, PilhaStrings pilha) {
		boolean inserir = false;
		do {
			if (endereco.contains("https://")) {
				if (endereco.contains("www")) {
					pilha.push(endereco);
					inserir = true;
					JOptionPane.showMessageDialog(null, "Endere�o inserido");
				} else {
					System.out.println("O endere�o escolhido precisa conter 'www' ");
					endereco = JOptionPane.showInputDialog("Digite o endere�o: \nExemplo: http://www.endere�o.com");
				}
			} else {
				System.out.println("O endere�o escolhido precisa conter 'https://' ");
				endereco = JOptionPane.showInputDialog("Digite o endere�o: \nExemplo: http://www.endere�o.com");
			}
		} while (!inserir);
	}

	public void removerEndereco(PilhaStrings pilha) {
		if (!pilha.isEmpty()) {
			try {
				pilha.pop();
				JOptionPane.showMessageDialog(null, "Endere�o exclu�do");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("A pilha est� vazia e n�o pode ser feita a exclus�o");
		}
	}

	public void consultarEndereco(PilhaStrings pilha) {
		if (!pilha.isEmpty()) {
			try {
				JOptionPane.showMessageDialog(null, pilha.top());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("A pilha est� vazia e n�o pode ser feita a exclus�o");
		}
	}
}
