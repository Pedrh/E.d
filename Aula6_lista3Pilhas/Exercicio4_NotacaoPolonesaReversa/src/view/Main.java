package view;

import javax.swing.JOptionPane;

import controller.NPRController;
import model.pilhaInt;

public class Main {

	public static void main(String[] args) {
		pilhaInt p = new pilhaInt();
		NPRController npr = new NPRController();
		
		int opt = 0;
		do {
		opt = Integer.parseInt(JOptionPane.showInputDialog("1- inserir valor \n2- realizar operação \n9-sair"));
		switch(opt) {
		case 1:
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a adicionar: "));
			npr.insereValor(p, valor);
			break;
		case 2:
			String op = JOptionPane.showInputDialog("Digite a operação que deseja fazer: \nOperações aceitas: + - * /");
			int resultado = npr.NRP(p, op);
			System.out.println("Resultado da operação: " + resultado);
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

