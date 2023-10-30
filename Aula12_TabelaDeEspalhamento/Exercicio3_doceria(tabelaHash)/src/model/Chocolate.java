package model;

public class Chocolate {
	
	public double gramas;
	public double altura;
	public double largura;
	public double comprimento;
	public double volume;
	public String receita;
	
	public Chocolate(double gramas, double altura, double largura, double comprimento, double volume, String receita) {
		super();
		this.gramas = gramas;
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
		this.volume = volume;
		this.receita = receita;
	}

	public Chocolate() {
		super();
	}

	@Override
	public int hashCode() {
		int posicao = (int) volume / 50;
		posicao -= 1;
		return posicao;
	}

	@Override
	public String toString() {
		return "\nChocolate: \nGramas= " + gramas + "g \nAltura= " + altura + "\nLargura= " + largura + "\nComprimento= "
				+ comprimento + "\nVolume= " + volume + "\n Receita com o chocolate= " + receita;
	}

	
	
	
	
}
