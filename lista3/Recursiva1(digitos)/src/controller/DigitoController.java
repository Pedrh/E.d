package controller;

public class DigitoController {

	public DigitoController() {
		super();
	}
	
	public int Digitos(int n, int qtd) {
		//condi��o de parada n == 0
		if(n == 0) {
			return qtd;
		}else {
			n = n / 10;
			qtd += 1;
			return Digitos(n, qtd);
		}
		//a fun��o divide o valor recebido por 10 e adiciona 1 � um contador enquanto o resultado da divis�o n�o for 0,...
	}

}


//IMPORTANTE: para a quest�o 4 ao inv�s de return 1 + Func(x, y) use return Func(x, y) + 1; Isso vai inverter o resultado bin�rio;