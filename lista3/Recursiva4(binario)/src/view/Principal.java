package view;
import controller.*;
public class Principal {

	public static void main(String[] args) {
		BinarioController bc = new BinarioController();
		String bin = "";
		int n = 25;
		String res = bc.Bin(bin, n);
		System.out.println(res);

	}

}
