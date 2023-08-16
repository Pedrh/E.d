package controller;

public class InversaoController {

	public InversaoController() {
		super();
	}
	public String Inversor(String palavra, int i, int f) {
		//condição de parada ==> quando c tiver o mesmo tamanho da palavra (parar na posição final)
		if(f==1) {
			return palavra.substring(i,f);
		}else {
			return palavra.substring(i, f) + Inversor(palavra, i - 1, f - 1);
		}
	} 
}

