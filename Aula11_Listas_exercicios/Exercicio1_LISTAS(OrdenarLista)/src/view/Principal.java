package view;

import fateczl.Lista.model.Lista;

public class Principal {

	public static void main(String[] args) {
		Lista<Integer> l = new Lista<>();
		
		try {
			l.add(10, 0);
			l.addLast(5);
			l.addLast(8);
			l.addLast(1);
			l.addLast(9);
			l.addLast(2);
			l.addLast(4);
			l.addLast(7);
			l.addLast(3);
			l.addLast(6);
			
			int tamanho = l.size();
			for(int i = 0; i < tamanho; i++) {
				for(int j = 0; j < tamanho - 1; j++) {
					if(l.get(j) > l.get(j+1)) {
						int v1 = l.get(j);
						int v2 = l.get(j+1);
						l.remove(j);
						l.remove(j);
						l.add(v1, j);
						l.add(v2, j);
					}	
				}
			}
			
			for(int i = 0; i < tamanho; i++ ) {
				System.out.println(l.get(i));
			}
		} catch (Exception e) {
		}
	}

}
