package view;

import javax.swing.JOptionPane;

import controller.HistoricoController;
import model.PilhaStrings;

public class Main {

	public static void main(String[] args) {
		PilhaStrings p = new PilhaStrings();
		HistoricoController historico = new HistoricoController();
		int opt = 0;
		do {
		opt = Integer.parseInt(JOptionPane.showInputDialog("1- inserir endereço \n2-remover endereço \n3-ver último endereço \n9-sair"));
		switch(opt) {
		case 1:
			String endereco = JOptionPane.showInputDialog("Digite o endereço: \nExemplo: http://www.endereço.com");
			historico.inserirEndereco(endereco, p);
			break;
		case 2:
			historico.removerEndereco(p);
			break;
		case 3:
			historico.consultarEndereco(p);
			break;
		case 9:
			System.exit(0);
			break;
		default:
			JOptionPane.showInputDialog("O valor digitado está incorreto");
			break;
		}
		
		}while(opt != 9);
	}

}
