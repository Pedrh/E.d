package controller;

public class DigitoController {

	public DigitoController() {
		super();
	}
	
	public int Digitos(int n, int qtd) {
		//condição de parada n == 0
		if(n == 0) {
			return qtd;
		}else {
			n = n / 10;
			qtd += 1;
			return Digitos(n, qtd);
		}
		//a função divide o valor recebido por 10 e adiciona 1 à um contador enquanto o resultado da divisão não for 0,...
	}

}


//IMPORTANTE: para a questão 4 ao invés de return 1 + Func(x, y) use return Func(x, y) + 1; Isso vai inverter o resultado binário;