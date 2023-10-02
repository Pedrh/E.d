package view;

import javax.swing.JOptionPane;

import controller.Documento;
import controller.ImpressoraController;
import model.Fila;

public class Principal {

	public static void main(String[] args){
		Fila<Documento> fila = new Fila<>();
		ImpressoraController impressora = new ImpressoraController();
		
		
		int opt = 0;
		do {
			opt = Integer.parseInt(JOptionPane.showInputDialog("1-inserir documento \n2- imprimir documentos \n9-fim"));
			switch(opt) {
			case 1:
				String documento = JOptionPane.showInputDialog("Digite o documento.\nFormato: id;Nome do processo");
				try {
					String partes[] = documento.split(";");
					Integer.parseInt(partes[0]);
					
					impressora.insereDocumento(fila, documento);
					
				}catch(Exception e) {
					System.err.println("Documento está no formato errado");
				}
				break;
			case 2:
				impressora.imprime(fila);
				break;
			case 9:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
				break;
			}
		}while(opt != 9);
		
		
		
		
//		impressora.insereDocumento(fila, documento);
	}

}
