package view;

import controller.EscalonadorController;
import controller.Processo;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		Processo[] processo = new Processo[6];
		Fila<Processo> fila = new Fila<>();
		EscalonadorController escalonador = new EscalonadorController();
		
		
		processo[0] = new Processo("notepad.exe", 14);
		fila.insert(processo[0]);
		
		processo[1] = new Processo("write.exe", 35);
		fila.insert(processo[1]);
		
		processo[2] = new Processo("chrome.exe", 27);
		fila.insert(processo[2]);
		
		processo[3] = new Processo("acrobat.exe", 52);
		fila.insert(processo[3]);
		
		processo[4] = new Processo("firefox.exe", 18);
		fila.insert(processo[4]);
		
		processo[5] = new Processo("word.exe", 25);
		fila.insert(processo[5]);
		
		escalonador.escalonador(fila);
				
	}

}
