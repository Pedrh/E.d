package controller;

public class SerieFcontroller {

	public SerieFcontroller() {
		super();
	}
	public double SerieFat(int n, double soma) {
		//condição de parada ==> quando n=1
		if(n==1) {
			return 1/(double)n;
		}else {
			soma = fatorial(n);
			return 1/(double)(soma) + SerieFat(n - 1, soma) ;
		}
		/*a função recebe o número n e chama outra função recursiva pra definir o fatorial de n( a parte do fatorial). 
		 Recebido o valor, a função retorna a soma de 1 sobre o valor fatorial +  a mesma função que
		 reduz o valor de n até que se torne 1 (a parte da soma)*/
	}
	
	
	public int fatorial(int n) {
		//condição de parada ==> quando n=1
		if(n==1) {
			return 1;
		}else {
			return n * fatorial(n -1);
		/*O valor de n vai ser multiplicado pelo mesmo valor descrescido 1 até que 
		  n tenha o valor de 1. Após o fim da função, o resultado é retornado para a variável soma 
		  da função recursiva anterior*/
		}
	}

}

/*
 n = 5
 
 1/5 + 1/4 + 1/3 + 1/2 +1
 
 retorna 1
 vira:
 1 + 1/2*1 + 1/3*2*1 + 1/4*3*2*1 + 1/5*4*3*2*1
 ou seja
 1 + 1/2 + 1/3*2! + 1/4*3! + 1/5*4!
 
 */
 