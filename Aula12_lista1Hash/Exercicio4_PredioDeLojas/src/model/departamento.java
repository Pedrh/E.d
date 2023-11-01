package model;

public class departamento {

	public int andar;
	public String nomeDepartamento;
	public String descricao;
	
	
	public departamento(int andar, String nomeDepartamento, String descricao) {
		super();
		this.andar = andar;
		this.nomeDepartamento = nomeDepartamento;
		this.descricao = descricao;
	}


	public departamento() {
		super();
	}


	public int hashCode(departamento dep) {
		int posicao = dep.andar;
		return posicao;
	}


	@Override
	public String toString() {
		return "departamento [andar=" + andar + ", nomeDepartamento=" + nomeDepartamento + ", descricao=" + descricao
				+ "]";
	}
	
	
	
	
}
