package controller;

public class ParController {

	public ParController() {
		super();
	}
	
	public int Npares(int[] vetor, int i, int par) {
		//condição de parada ==> quando i<0
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
			/*a função retorna o mesmo vetor só que com índice - 1 (checa ele com ele mesmo) e caso o valor
			na nova posição do vetor for divisível por 2, será atribuído 1 à variável par*/
		}
	}
}
