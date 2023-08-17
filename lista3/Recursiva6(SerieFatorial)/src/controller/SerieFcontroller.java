package controller;

public class SerieFcontroller {

	public SerieFcontroller() {
		super();
	}
	public double SerieFat(int n, double soma) {
		//condi��o de parada ==> quando n=1
		if(n==1) {
			return 1/(double)n;
		}else {
			soma = fatorial(n);
			return 1/(double)(soma) + SerieFat(n - 1, soma) ;
		}
		/*a fun��o recebe o n�mero n e chama outra fun��o recursiva pra definir o fatorial de n( a parte do fatorial). 
		 Recebido o valor, a fun��o retorna a soma de 1 sobre o valor fatorial +  a mesma fun��o que
		 reduz o valor de n at� que se torne 1 (a parte da soma)*/
	}
	
	
	public int fatorial(int n) {
		//condi��o de parada ==> quando n=1
		if(n==1) {
			return 1;
		}else {
			return n * fatorial(n -1);
		/*O valor de n vai ser multiplicado pelo mesmo valor descrescido 1 at� que 
		  n tenha o valor de 1. Ap�s o fim da fun��o, o resultado � retornado para a vari�vel soma 
		  da fun��o recursiva anterior*/
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
 