package view;

import javax.swing.JOptionPane;

import controller.FatController;

public class Principal {

	public static void main(String[] args) {
		FatController Fc =new FatController();
		int Num;
		do {
			Num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero de 0 a 10: "));
			
			if(Num <0 || Num > 10) {
				System.out.println("Precisa ser entre 0 e 10, animal!!!!");
			}
		}while(Num <0 || Num > 10);
		
		long result = Fc.fatorial(Num);
		System.out.println(result);
	}

}
