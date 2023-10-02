package controller;

public class Processo {
	public String Nome;
	public int QtdRetornos;
	
	public Processo(String Nome, int QtdRetornos) {
		this.Nome = Nome;
		this.QtdRetornos = QtdRetornos;
	}
	
	public Processo() {
		
	}

	@Override
	public String toString() {
		return "Processo [Nome= " + Nome + ", Quantidade de Retornos= " + QtdRetornos + "]";
	}
	
	
}
