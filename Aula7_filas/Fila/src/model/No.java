package model;

public class No<T> {
//esse <T> serve como um Tipo genérico, que recebe qualquer tipo e funciona com ele
	T dado;
	No<T> proximo;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+dado+"]"; //serve pra mostrar uma string no outline na hora de debugar
	}
	
	
	
}