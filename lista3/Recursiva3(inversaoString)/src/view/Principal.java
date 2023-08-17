package view;

import controller.*;

public class Principal {

	public static void main(String[] args) {
		InversaoController ic = new InversaoController();
		String palavra = "teste"; 
		int fim = palavra.length();
		int inicio = fim - 1;
		String res = ic.Inversor(palavra, inicio, fim);
		System.out.println(res);
	}

}
