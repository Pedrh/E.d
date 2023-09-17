package controller;

import model.pilhaInt;

public class NPRController {

	public NPRController() {
		super();
	}

	public void insereValor(pilhaInt p, int valor) {
		p.push(valor);
		System.out.println("Valor adicionado");
	}

	public int NRP(pilhaInt p, String op) {
		int v1 = 0;
		int v2 = 0;
		int operacao = 0;
		
		if (!p.isEmpty()) {
			try {
				if (p.size() >= 2) {
					try {
						switch (op) {
						case "+":
							v1 = p.pop();
							v2 = p.pop();
							operacao = v1 + v2;
							p.push(operacao);
							break;
						case "*":
							v1 = p.pop();
							v2 = p.pop();
							operacao = v1 * v2;
							p.push(operacao);
							break;
						case "-":
							v1 = p.pop();
							v2 = p.pop();
							operacao = v2 - v1;
							p.push(operacao);
							break;
						case "/":
							v1 = p.pop();
							v2 = p.pop();
							operacao = v2 - v1;
							p.push(operacao);
							break;
						}
					} catch (Exception e) {
					}
				}else {
					System.err.println("São necessários pelo menos 2 valores para uma operação");
				}
			} catch (Exception e2) {
			}
		} else {
			System.out.println("Pilha vazia, a operação não pode ser feita");
		}
		return operacao;
	}
}
