package view;

import controller.*;

public class Principal {

	public static void main(String[] args) {
		InversaoController ic = new InversaoController();
		String palavra = "teste"; 
		String inverso = "";
		int i = palavra.length();
		int c = 1;
		String res = ic.Inversor(palavra, i, inverso, c);
		System.out.println(res);
	}

}
