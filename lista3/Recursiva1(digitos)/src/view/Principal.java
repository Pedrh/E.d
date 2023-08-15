package view;
import controller.*;

public class Principal {

	public static void main(String[] args) {
		DigitoController dc = new DigitoController();
		
		int n = 12346, quantidade = 0;
		int res = dc.Digitos(n, quantidade);
		System.out.println(res);
	}

}
