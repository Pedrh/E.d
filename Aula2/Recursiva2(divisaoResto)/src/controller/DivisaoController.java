package controller;

public class DivisaoController {

	public DivisaoController() {
		super();
	}

	public int divisao(int a, int b) {
		//condi��o de parada ==> quando a - b < 0
		if(a-b < 0 ) {
			return a;
		}else {
			a -= b;
			return divisao(a, b);
			/*a fun��o checa se a divis�o de a - b resulta em um valor negativo. Se n�o, ele reduz o valor de a
			at� se tornar indivis�vel pelo b*/
		}
	}

}
