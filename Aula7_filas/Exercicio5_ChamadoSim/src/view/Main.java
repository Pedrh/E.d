package view;

import javax.swing.JOptionPane;

import controller.Cliente;
import controller.FilaController;
import model.Fila;

public class Main {

	public static void main(String[] args) {
		Fila<Cliente> fila = new Fila<>();
		Fila<Cliente> filaPrioritarios = new Fila<>();
		FilaController filaController = new FilaController(fila, filaPrioritarios);
		
		String nome;
		int senha;
		
		int opc = 0;
		while(opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Inserir senha \n2- Inserir senha prioritária \n3- Chamar para atendimento \n9-fim"));
			switch(opc) {
			case 1:
				nome = JOptionPane.showInputDialog("Digite o nome: ");
				senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha normal: "));
				filaController.inserirCliente(nome, senha, opc);
				break;
			case 2:
				nome = JOptionPane.showInputDialog("Digite o nome: ");
				senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha Prioritaria: "));
				filaController.inserirClientePrioriario(nome, senha, opc);
				break;
			case 3:
				filaController.chamarAtendimento();
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("Dado não correspondente, tente novamente");
			}
			
		}
		
	}

}
