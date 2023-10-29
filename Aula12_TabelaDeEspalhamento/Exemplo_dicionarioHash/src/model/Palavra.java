package model;

import java.util.Objects;

public class Palavra {
	public String verbete;
	public String significado;
	
	
	
	@Override
	public int hashCode() {
		int posicao = verbete.toLowerCase().charAt(0);
		posicao -= 97; //a letra a na tabela ascci é 97,como o vetor começa na posição 0, você joga o a direto no 0, b no 1...
		return posicao;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Palavra other = (Palavra) obj;
		return Objects.equals(significado, other.significado) && Objects.equals(verbete, other.verbete);
	}



	@Override
	public String toString() {
		return "Palavra \nVerbete=" + verbete + "\nSignificado=" + significado;
	}
	
}
