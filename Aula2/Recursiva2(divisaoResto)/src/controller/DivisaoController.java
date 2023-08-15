package controller;

public class DivisaoController {

	public DivisaoController() {
		super();
	}

	public int divisao(int a, int b) {
		//condição de parada ==> quando a - b < 0
		if(a-b < 0 ) {
			return a;
		}else {
			a -= b;
			return divisao(a, b);
			/*a função checa se a divisão de a - b resulta em um valor negativo. Se não, ele reduz o valor de a
			até se tornar indivisível pelo b*/
		}
	}

}
