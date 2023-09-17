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
		opt = Integer.parseInt(JOptionPane.showInputDialog("1- inserir endere�o \n2-remover endere�o \n3-ver �ltimo endere�o \n9-sair"));
		switch(opt) {
		case 1:
			String endereco = JOptionPane.showInputDialog("Digite o endere�o: \nExemplo: http://www.endere�o.com");
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
			JOptionPane.showInputDialog("O valor digitado est� incorreto");
			break;
		}
		
		}while(opt != 9);
	}

}
