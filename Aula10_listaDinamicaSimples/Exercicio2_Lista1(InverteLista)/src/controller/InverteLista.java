package controller;

import fateczl.Lista.model.Lista;
import model.pilhaInt;

public class InverteLista {

	pilhaInt p = new pilhaInt();

	public InverteLista() {
		super();
	}

	public Lista<Integer> inveter(Lista<Integer> l) {
		
		try {
			while (!l.isEmpty()) {
				int valor = l.get(0);
				p.push(valor);
				l.removeFirst();
			}

			int i = 0 ;
			while (!p.isEmpty()) {
				int valorNovo = p.pop();
				l.add(valorNovo, i);
				i++;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

}
