package view;

import java.util.Scanner;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		FatorialController fc = new FatorialController();
		Scanner ler = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("Digite um valor positivo impar:");
			 n = ler.nextInt();
			
		}while(n % 2 == 0 || n < 0);
		
		ler.close();
		
		int res = fc.Fatorial(n);
		System.out.println(res);
		
	}

}
