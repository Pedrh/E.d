package view;
import controller.MultiplicaController;

public class Principal {

	public static void main(String[] args) {
		MultiplicaController mc = new MultiplicaController();
		
		int  a = 6, b = 5;
		int res = mc.multiplica(a, b);
		System.out.println(res);
	}

}
