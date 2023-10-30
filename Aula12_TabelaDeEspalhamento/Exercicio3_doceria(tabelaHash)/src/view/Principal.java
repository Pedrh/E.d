package view;

import javax.swing.JOptionPane;

import controller.CalculaChocolate;
import model.Chocolate;

public class Principal {

	public static void main(String[] args) {
		CalculaChocolate calcula = new CalculaChocolate();
		
		int opt;
		
		do {
			opt = Integer.parseInt(JOptionPane.showInputDialog("Digite \n1- Adicionar o chocolate à lista de receitas"
					+ "\n2- encontrar um chocolate na lista \n9 - encerrar"));
			try {
			switch(opt) {
			case 1:
				
				Chocolate novaBarraChocolate = new Chocolate();
				novaBarraChocolate.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
				novaBarraChocolate.largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura: "));
				novaBarraChocolate.comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento: "));
				calcula.adicionaChocolate(novaBarraChocolate);
				break;
				
			case 2:
				Chocolate encontraBarraChocolate = new Chocolate();
				encontraBarraChocolate.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
				encontraBarraChocolate.largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura: "));
				encontraBarraChocolate.comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento: "));
				calcula.encontraChocolate(encontraBarraChocolate);
				break;
				
			case 9:
				System.out.println("Encerrando...");
				System.exit(0);
				break;
				
			default:
				System.err.println("Por favor, selecione uma das opções apresentadas");
				break;
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}while(opt !=9);
		
	}

}
