package controller;

public class Documento {

	int ID_pc;
	String Nome_arquivo;
	
	public Documento(int ID_pc, String Nome_arquivo) {
		this.ID_pc = ID_pc;
		this.Nome_arquivo = Nome_arquivo;
	}
	
	public Documento() {
	}

	@Override
	public String toString() {
		return "Documento [ID_pc=" + ID_pc + ", Nome_arquivo=" + Nome_arquivo + "]";
	}
	
	

}
