package view;

import javax.swing.JOptionPane;

import controller.ConverteController;
import model.PilhaStrings;

public class Main {

	public static void main(String[] args) throws Exception {
		int opt = 0;
		int valorDec = 0;
		boolean confirm = false;
		do {
			do {
				opt = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 se quiser converter ou 0 se quiser sair"));
				if(opt == 1 || opt ==0) {
					confirm = true;
				}else {
					JOptionPane.showMessageDialog(null, "Deve ser 1 ou 0!!!!");
				}
			}while(!confirm);
			
			if (opt == 1) {
				do {
					valorDec = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que quer converter pra binário: "));
					if (valorDec > 1000) {
						JOptionPane.showMessageDialog(null, "Tem que ser menor que 1000");
					}
				} while (valorDec > 1000);
				ConverteController converte = new ConverteController();
				converte.ConverteController(valorDec);
			}
			opt = Integer.parseInt(JOptionPane.showInputDialog("1- continuar  \n0 - sair"));
		} while (opt != 0);
		
		
	}

}
