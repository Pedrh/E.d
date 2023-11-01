package model;

public class Cliente {
	
	public int numeroConta;
	public String nomeCliente; 
	public double saldo;
	
	
	public Cliente(int numeroConta, String nomeCliente, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}


	public Cliente() {
		super();
	}


	@Override
	public String toString() {
		return "\n------------------------\nCliente \n\nNumero da Conta= " + numeroConta + "\nNome do Cliente= " + nomeCliente + "\nSaldo= " + saldo;
	}
	
	
	
}
