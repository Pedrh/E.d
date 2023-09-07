package model;

public class pilhaInt {

	No topo;	
	public pilhaInt() {
		topo = null; //em todas as pilhas, o topo vai começar como o primeiro valor (o null).
	}
	
	public boolean isEmpty() { //Para funções boleanas, a boa prática é sempre começar o nome com is....
		//checa se a pilha está vazia
		if(topo == null) {
			return true;
		}else {
			return false;
		}
		
	}

	public void push(int valor) {
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = topo;
		topo = elemento;
	}
	
	public int pop() throws Exception { // serve para explodir o valor do topo e buscar o antigo topo. 
		if(isEmpty()) {//já checa se está vazia
			throw new Exception("Pilha vazia");
		}
		int valor = topo.dado; //serve pra preservar o antigo topo antes de explodir o mesmo da pilha
		topo = topo.proximo;
		return valor;
	}
	
	
	public int top() throws Exception{ // é a mesma ideia do pop só que só vai checar o valor que está no topo, sem fazer nada
		if(isEmpty()) {
			throw new Exception("Pilha vazia");
		}
		int valor = topo.dado;
		return valor;
	}
	
	public int size() { //serve pra percorrer toda a pilha aumentando um contador e depois retornar o tamanho da pilha
		int cont = 0;
		if(!isEmpty()) {
			No aux = topo;
			while(aux != null) {
				cont++;
				aux = aux.proximo;
			}
		}
		return cont;
	}
}
