package view;

import fateczl.Lista.model.Lista;

public class Principal {

	public static void main(String[] args) {
		Lista<Integer> lA = new Lista<>();
		Lista<Integer> lB = new Lista<>();
		Lista<Integer> lI = new Lista<>();
		Lista<Integer> lU = new Lista<>();
		
		
		try {
			lA.add(3, 0);
			lA.addLast(5);
			lA.addLast(8);
			lA.addLast(12);
			lA.addLast(9);
			lA.addLast(7);
			lA.addLast(16);
			
			lB.add(9, 0);
			lB.addLast(6);
			lB.addLast(2);
			lB.addLast(3);
			lB.addLast(7);
			
			
			for(int b = 0; b < lB.size(); b++) {
				for(int a = 0; a < lA.size(); a++) {
					if(lB.get(b) == lA.get(a)) {
						lI.addFirst(lB.get(b));
					}
				}
			}
			
			for(int i = 0; i < lA.size(); i++) {
				lU.add(lA.get(i), i);
			}
			for(int i = 0; i < lB.size(); i++) {
				lU.add(lB.get(i), i+lA.size());
			}
			
			System.out.println("Interssecção: ");
			for(int i = 0; i < lI.size(); i++) {
				System.out.println(lI.get(i));
			}
			
			System.out.println("União: ");
			for(int i = 0; i < lU.size(); i++) {
				System.out.println(lU.get(i));
			}
		} catch (Exception e) {
			
		}
	}

}
