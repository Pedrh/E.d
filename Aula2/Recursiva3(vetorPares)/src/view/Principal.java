package view;
import controller.ParController;

public class Principal {

	public static void main(String[] args) {
		ParController pc = new ParController();
		
		int[] vet = {5, 13, 8, 7, 6, 9, 20};
		int i = vet.length - 1, par = 0;
		
		int res = pc.Npares(vet, i, par);
		System.out.println(res);
	}

}
