package view;

import javax.swing.JOptionPane;

import controller.TelefoneController;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		Fila<String> fila = new Fila<>();
		TelefoneController telefone = new TelefoneController();
		
		int opt = 0;
		do {
			opt = Integer.parseInt(JOptionPane.showInputDialog("1-Inserir número \n2-ConsultarChamadas \n9-fim"));
			switch(opt) {
			case 1:
				String numeroTelefone = JOptionPane.showInputDialog("Digite o número à ser adicionado");
				telefone.insereLigacao(fila, numeroTelefone);
				break;
			case 2:
				try {
					telefone.consultaLigacao(fila);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 9:
				System.out.println("Encerrando....");
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Essa opção não é válida!! Tente novamente");
			}
		}while(opt != 9);
		
	}

}
