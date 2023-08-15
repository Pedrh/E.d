package view;
import controller.FiboController;

public class Principal {

	public static void main(String[] args) {
		FiboController fc = new FiboController();
		
		int n = 8;
		int res = fc.Fib(n);
		System.out.println(res);
	}

}
