package controller;

public class InversaoController {

	public InversaoController() {
		super();
	}
	public String Inversor(String palavra, int i,String inverso, int c) {
		//condição de parada ==> quando c tiver o mesmo tamanho da palavra (parar na posição final)
		if(c==i-1) {
			return inverso;
		}else {
			c +=1;
			inverso = palavra.substring(c);
			return Inversor(palavra, i, inverso, c) + Inversor(palavra, i, inverso, c);
		}
	} //FALTA ENCONTRAR UMA FORMA DE IR DIMINUINDO O C PRA RETORNAR AS OUTRAS LETRAS NA SEGUNDA PARTE DA SOMA

}
/*public class InversaoController {
	public static void main(String[] args) {

		// como usar a string
		String teste = "exemplo";
		int i = teste.length() - 1;
		int c;
		for(c=0; c<=i; c++) {
			System.out.println(teste.substring(0, c)); 
		}

	}

}*/

