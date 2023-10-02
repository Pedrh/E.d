package model;

public class Cliente {
	
	public String Nome;
	public int QuantidadePecas;
	public float ValorPecas;
	
	public Cliente(String Nome, int QuantidadePecas, float ValorPecas) {
		this.Nome = Nome;
		this.QuantidadePecas = QuantidadePecas;
		this.ValorPecas = ValorPecas;
	}
	
	public Cliente() {
		
	}

	@Override
	public String toString() {
		return "Cliente [Nome=" + Nome + ", QuantidadePecas=" + QuantidadePecas + ", ValorPecas=" + ValorPecas + "]";
	}
	
	

}
