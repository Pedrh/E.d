package view;
import controller.*;
public class Principal {

	public static void main(String[] args) {
		SerieFcontroller sfc = new SerieFcontroller();
		
		int n = 3;
		double soma = 0;
		double res = sfc.SerieFat(n, soma);
		System.out.println(res);

	}

}
