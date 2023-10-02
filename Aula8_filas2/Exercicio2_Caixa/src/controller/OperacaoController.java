package controller;

//import model.Cliente; 
import model.Fila;

public class OperacaoController {
	Cliente cliente;
	public OperacaoController() {
		super();
	}
	
	public void caixa(Fila<Cliente> fila) {
		float valorTotal = cliente.QuantidadePecas * cliente.ValorPecas;
		System.out.println("Nome: " + cliente.Nome + ", total da compra: " + valorTotal);
		System.out.println(fila.size());
	}
	
	

}