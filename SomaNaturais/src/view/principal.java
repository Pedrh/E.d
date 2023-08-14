package view;
import controller.SomaController;

public class principal{

	public static void main(String[] args) {
		SomaController sc = new SomaController();
		
		int n = 10;
		int res = sc.soma(n);
		System.out.println(res);
	}

}
