package controller;

import javax.swing.JOptionPane;

import fateczl.Lista.model.Lista;
import model.Musica;

public class PlayerController {

	Lista<Musica> lista;

	public PlayerController() {
		super();
	}

	public String testarNome(String musica) {
		String[] atributosMusica = musica.split(";");
		if (atributosMusica.length != 3) {
			boolean isCorrect = false;
			do {
				JOptionPane.showMessageDialog(null, "O formato da m�sica est� errado, tente de novo");
				musica = JOptionPane.showInputDialog(
						"Digite o nome da m�sica, nome do cantor e o tempo da m�sica separados por ponto e v�rgula: ");
				atributosMusica = musica.split(";");
				if (atributosMusica.length == 3) {
					isCorrect = true;
				}
			} while (!isCorrect);
		}
		return musica;
	}

	public void adicionaMusica(Lista<Musica> lista, String musica) {
		try {
			String[] atributos = musica.split(";");
			Musica musicas = new Musica(atributos[0], atributos[1], Integer.parseInt(atributos[2]));
			lista.addLast(musicas);
		} catch (Exception e) {
		}
	}

	public void removeMusica(Lista<Musica> lista, int posicao) throws Exception {
		try {
			lista.remove(posicao);
			System.out.println("M�sica removida");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage()); // n�o sei se � o suficiente
		}
	}

	public void executarPlaylist(Lista<Musica> lista) throws Exception {
		try {
			if(lista.isEmpty()) {
				throw new Exception("Lista vazia");
			}
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
