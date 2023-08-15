package view;
import controller.*;

public class Principal {

	public static void main(String[] args) {
		MdcController mc = new MdcController();
		
		int x = 13, y = 169;
		int res = mc.MDC(x, y);
		
		System.out.println(res);
	}

}
