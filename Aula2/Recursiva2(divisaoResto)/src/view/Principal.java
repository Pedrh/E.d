package view;
import controller.DivisaoController;

public class Principal {

	public static void main(String[] args) {
		DivisaoController dc = new DivisaoController();
		
		int a = 15, b = 3;
		int res = dc.divisao(a, b);
		System.out.println(res);
		
	}

}
