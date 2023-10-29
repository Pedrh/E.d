package model;

public class Morador {
	public int apt;
	public int andar;
	public String nome;
	public String modelo;
	public String cor;
	public String placa;
	
	public Morador(int apt, int andar, String nome, String modelo, String cor, String placa) {
		super();
		this.apt = apt;
		this.andar = andar;
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
	}
	
	public Morador() {
		super();
	}
	
	

	@Override
	public int hashCode() {
		int posicao = andar;
		posicao -= 1;
		return posicao;
	}



	@Override
	public String toString() {
		return "Morador \nNome=" + nome + "\nApt= " + apt + "\nAndar= " + andar + "\nModelo do carro= " + modelo + "\nCor do carro= " + cor
				+ "\nPlaca do carro= " + placa;
	}


	
	
	
}
