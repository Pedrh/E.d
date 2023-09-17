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
					JOptionPane.showMessageDialog(null, "Endereço inserido");
				} else {
					System.out.println("O endereço escolhido precisa conter 'www' ");
					endereco = JOptionPane.showInputDialog("Digite o endereço: \nExemplo: http://www.endereço.com");
				}
			} else {
				System.out.println("O endereço escolhido precisa conter 'https://' ");
				endereco = JOptionPane.showInputDialog("Digite o endereço: \nExemplo: http://www.endereço.com");
			}
		} while (!inserir);
	}

	public void removerEndereco(PilhaStrings pilha) {
		if (!pilha.isEmpty()) {
			try {
				pilha.pop();
				JOptionPane.showMessageDialog(null, "Endereço excluído");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("A pilha está vazia e não pode ser feita a exclusão");
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
			System.out.println("A pilha está vazia e não pode ser feita a exclusão");
		}
	}
}
