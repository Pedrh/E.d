package view;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		FatorialController fc = new FatorialController();
		
		int n = 5;
		int fat = fc.fatorial(n);
		System.out.println(fat);
	}

}
