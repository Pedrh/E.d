package controller;

public class ParController {

	public ParController() {
		super();
	}
	
	public int Npares(int[] vetor, int i, int par) {
		//condi��o de parada ==> quando i<0
		if(i < 0) {
			return par;
		}else {
			if(vetor[i] % 2 == 0) {
				i -= 1;
				par += 1;
				return Npares(vetor, i, par);
			}else{
				i -= 1;
				return Npares(vetor, i, par);
			}
			/*a fun��o retorna o mesmo vetor s� que com �ndice - 1 (checa ele com ele mesmo) e caso o valor
			na nova posi��o do vetor for divis�vel por 2, ser� atribu�do 1 � vari�vel par*/
		}
	}
}
