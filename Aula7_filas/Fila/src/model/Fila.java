package model;

public class Fila<T> {

	No<T> inicio;
	No<T> fim;
	
	public Fila() {
		inicio = null;
		fim = inicio;
	}

	public boolean isEmpty() {
		if(inicio == fim && inicio == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void insert(T dado) {
		No<T> elemento = new No<>(); //n�o  precisa explicar que ele � gen�rico de novo
		elemento.dado = dado;
		elemento.proximo = null;
		if(isEmpty()) {
			inicio = elemento;
			fim = inicio;
		}else {
			fim.proximo = elemento;
			fim = elemento;
		}
	}
	
	public T remove() throws Exception {
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		T dado = inicio.dado;
		if(inicio == fim && inicio != null) { //fila de um elemento
			inicio = null;
			fim = null;
			//volta a ser vazia
		}else {
			inicio = inicio.proximo;
		}
		return dado;
	}
	
	public void list()throws Exception{
		if(isEmpty()) {
			throw new Exception("Fila Vazia");
		}
		No<T> auxiliar = inicio;
		while(auxiliar != null) {
			System.out.print(auxiliar.dado + " ");
			auxiliar = auxiliar.proximo;
		}
		System.out.println("");
	}
	
	public int size() {
		int cont  = 0;
		if(isEmpty()) {
			No<T> auxiliar = inicio;
			while(auxiliar != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
	
	public void comoInstanciar() {
		System.out.println("Para instanciar essa fila, pode ser dessa forma: Fila<Integer> filaInt = new Fila<>(); \nonde o <> � onde indica o tipo que a fila vai trabalhar");
	}
	
}

