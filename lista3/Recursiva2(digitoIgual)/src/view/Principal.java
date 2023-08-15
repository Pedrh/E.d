package view;
import controller.*;

public class Principal {

	public static void main(String[] args) {
		DigitoController dc = new DigitoController();
		
		int n = 1236252, dig = 2, qtd =0;
		int res = dc.EncontraDigito(n, dig, qtd);
		System.out.println(res);
	}

}
