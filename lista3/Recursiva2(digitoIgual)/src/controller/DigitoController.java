package controller;

public class DigitoController {

	public DigitoController() {
		super();
	}
	
	public int EncontraDigito(int n, int dig, int qtd) {
		//condição de saída ==> quando n for próximo de 0
		if(n%10==0) {
			if(n == dig) {
				qtd +=1;
				return qtd;
			}else {
				return qtd;
			}
			
		}else {
			if(n%10 == dig) {
				n = n/ 10;
				qtd +=1;
				return EncontraDigito(n, dig, qtd);
			}else {
				n = n/ 10;
				return EncontraDigito(n, dig, qtd);
			}
			//
		}
	}

}
