package view;
import controller.SerieController;

public class Principal {

	public static void main(String[] args) {
		SerieController sc = new SerieController();
		int n = 6;
		int c = 1;
		double Soma = 0;
		
		double res = sc.Serie(n, c, Soma);
		System.out.println(res);
	}
	
	

}
