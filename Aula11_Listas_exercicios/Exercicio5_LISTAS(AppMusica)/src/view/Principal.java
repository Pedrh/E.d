package view;

import javax.swing.JOptionPane;

import controller.PlayerController;
import fateczl.Lista.model.Lista;
import model.Musica;

public class Principal {

	public static void main(String[] args) {
		PlayerController player = new PlayerController();
		Lista<Musica> lista = new Lista<>();
		
		int opt;
		do {
			opt = Integer.parseInt(JOptionPane.showInputDialog("Deseja: \n 1 - Inserir uma nova música playlist \n 2 - Remover uma música da playlist \n 3 - Tocar a playlist inteira \n 9 - Sair do aplicativo"));
			switch(opt) {
			case 1:
				String musica = JOptionPane.showInputDialog("Digite o nome da música, nome do cantor e o tempo da música separados por ponto e vírgula: ");
				//testar se o nome foi colocado corretamente
				musica = player.testarNome(musica);
				//teste realizado
				player.adicionaMusica(lista, musica);
				break;
			case 2:
				try {
					int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da música que você deseja retirar: "));
					player.removeMusica(lista, posicao);
				} catch (Exception e) {
					System.err.println(e.getMessage()); 
				}
				break;
			case 3:
				try {
					player.executarPlaylist(lista);
				} catch (Exception e) {
					System.err.println(e.getMessage()); 
				}
				break;
			case 9:
				System.out.println("Sistema encerrando...");
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma das opções mostradas!");
			}
		
		}while(opt != 9);
		
	}

}
