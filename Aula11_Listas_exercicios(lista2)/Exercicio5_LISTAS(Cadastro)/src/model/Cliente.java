package model;

public class Cliente {

	public String CPF;
	public String Nome;
	public int Idade;
	public double LimiteCredito;


	public Cliente(String cPF, String nome, int idade, double limiteCredito) {
		super();
		this.CPF = cPF;
		this.Nome = nome;
		this.Idade = idade;
		this.LimiteCredito = limiteCredito;
	}


	public Cliente() {
		super();
	}
	
	@Override
	public String toString() {
		return CPF + "; " + Nome + "; " + Idade + "; " + LimiteCredito;
	}

}
