package view;

import controller.InverteLista;
import fateczl.Lista.model.Lista;

public class Principal {

	public static void main(String[] args) {
		Lista<Integer> l = new Lista<>();
		InverteLista iL = new InverteLista();
		
		try {
			l.addFirst(16);
			l.addFirst(4);
			l.addFirst(13);
			l.addFirst(2);
			l.addFirst(6);
			l.addFirst(7);
			l.addFirst(9);
			l.addFirst(12);
			l.addFirst(18);
			l.addFirst(5);
			l.addFirst(3);
		
			Lista<Integer> NovaLista = iL.inveter(l);
			
			for(int i=0; i < l.size(); i++) {
				System.out.print(NovaLista.get(i) + "; ");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
