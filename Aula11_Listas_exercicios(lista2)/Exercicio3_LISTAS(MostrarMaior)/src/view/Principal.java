package view;

import fateczl.Lista.model.Lista;

public class Principal {

	public static void main(String[] args) {
		Lista<Integer> l = new Lista<>();
		
		try {
			l.addLast(3);
			l.addLast(5);
			l.addLast(8);
			l.addLast(12);
			l.addLast(9);
			l.addLast(7);
			l.addLast(6);
			l.addLast(2);
			l.addLast(3);
			l.addLast(7);
			l.addLast(16);
			
			for(int i = 0; i < l.size(); i++) {
				for(int j = 0; j < l.size() - 1; j++) {
					if(l.get(j) > l.get(j+1)) {
						int valorMaior = l.get(j);
						l.remove(j);
						l.add(valorMaior, j+1);
					}
				}
			}
			
			System.out.println(l.get(l.size() - 2));
			System.out.println(l.get(l.size() - 1));
		} catch (Exception e) {
		}
	}

}
