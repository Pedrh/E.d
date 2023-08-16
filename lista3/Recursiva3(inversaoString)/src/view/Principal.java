package view;

import controller.*;

public class Principal {

	public static void main(String[] args) {
		InversaoController ic = new InversaoController();
		String palavra = "paralelepipedo"; 
		int fim = palavra.length();
		int inicio = fim - 1;
		String res = ic.Inversor(palavra, inicio, fim);
		System.out.println(res);
	}

}
