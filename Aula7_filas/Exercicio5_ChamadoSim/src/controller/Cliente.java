package controller;

public class Cliente {

	public String nome;
	public int senha;
	
	public Cliente(String nome, int senha) {
		this.nome = nome;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return nome+ ", senha: " +senha;
	}
	
	

}
