package controller;

public class DigitoController {

	public DigitoController() {
		super();
	}
	
	public int EncontraDigito(int n, int dig, int qtd) {
		//condi��o de sa�da ==> quando n for pr�ximo de 0
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
			/*a fun��o faz a checagem do restor do n�mero recebido dividido por 10 e compara com o digito
			tamb�m recebido antes de fazer a real divis�o do n�mero para trocar a posi��o da v�rgula
			n = 1236252
			n / 10 = 123625,2 com resto 2
			n / 10 = 12362,5 com resto 5*/
		}
	}

}
