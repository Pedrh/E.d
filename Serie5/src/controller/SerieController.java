package controller;

public class SerieController {

	public SerieController() {
		super();
	}
	
	public double Serie(int n, int c, double Soma) {
		//condição de saída ==> quando c = n
		if(c == n) {
			return 1/ (double)n;
		}else {
			return Soma = 1/(double)c + Serie(n, c + 1, Soma);
			/* A série vai repetir a  soma 1/ c + 1/ (c +1) , sendo c uma variável que vai ser somada 1
			 até que seu valor seja o número final recebido (n, no caso)*/
		}
	}

}
