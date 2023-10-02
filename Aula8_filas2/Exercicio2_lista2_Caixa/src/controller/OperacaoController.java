package controller;

import model.Fila;

public class OperacaoController {
	Cliente proximoCliente = new Cliente();
	public OperacaoController() {
		super();
	}
	
	public void caixa(Fila<Cliente> fila) {
		try {
			while(!fila.isEmpty()) {
				proximoCliente = fila.remove();
				float valorCompra = proximoCliente.QuantidadePecas * proximoCliente.Valorpecas;
				System.out.println(proximoCliente.Nome + " gastou " + valorCompra + "$");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
