package controller;

public class BinarioController {

	public BinarioController() {
		super();
	}
	
	public String Bin(String binario, int n) {
		//condição de parada ==> quando n == 0
		if(n/2==0) {
			return binario;
		}else {
			binario = n%2 + "";
			n = n/2;
			return Bin(binario, n)+ binario;
		}
	}

}
