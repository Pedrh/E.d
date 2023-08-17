package controller;

public class InversaoController {

	public InversaoController() {
		super();
	}
	public String Inversor(String palavra, int i, int f) {
		//condição de parada ==> quando f for subtraido até que f=1 e i= 0
		if(f==1) {
			return palavra.substring(i,f);
		}else {
			return palavra.substring(i, f) + Inversor(palavra, i - 1, f - 1);
		}
		/*quando f=1 e i=0 ele busca a primeria letra da palavra e vai adicionando as próximas letras
		 enquanto o valor de f e de i vão sendo acrescidos 1:
		 
		 quando f=1 e i=0, retorno = t
		 quando f=2 e i=1, retorno = e
		 quando f=3 e i=2, retorno = s
		 ...
		 porém como a função está sendo chamada como o segundo valor da soma, o retorno é invertido*/
	} 
}

