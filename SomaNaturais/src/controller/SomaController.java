package controller;

public class SomaController {
	public SomaController() {
		super();
	}
	
	public int soma(int n) {
	//condi��o de parada ==> retorna quando n-1 = 0
	if(n == 0) {
		return 0;
	}else {
		return n + soma(n - 1);
	/* ...
	   retorna = 3 + soma(3-1)
	   retorna = 2 + soma (2-1)
	   retorna = 1 + soma(1-1)
	   retona 0
	*/}
}
}
