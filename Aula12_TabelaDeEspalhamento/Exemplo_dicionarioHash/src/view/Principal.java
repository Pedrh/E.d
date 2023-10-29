package view;

import controller.Dicionario;
import model.Palavra;

public class Principal {

	public static void main(String[] args) {
		Palavra p0 = new Palavra();
		p0.verbete = "Vocábulo";
		p0.significado = "Cada uma das partes átonas que fazem referência ao léxico, nomeadamente as conjunções, as preposições, os pronomes oblíquos e os artigos que, não possuindo a capacidade de formar um enunciado, se juntam a outros dando origem a um termo fonético.";
		
		Palavra p1 = new Palavra();
		p1.verbete = "Voz";
		p1.significado = "Vibração nas pregas vocais que produz sons e resulta da pressão do ar ao percorrer a laringe.";
		
		Palavra p2 = new Palavra();
		p2.verbete = "Palestra";
		p2.significado = "Conversa sobre coisas de somenos importância";
		
		Palavra p3 = new Palavra();
		p3.verbete = "Teclado";
		p3.significado = "O conjunto de teclas de um instrumento: teclado do piano; teclado da máquina de escrever";
		
		Palavra p4 = new Palavra();
		p4.verbete = "Tarefa";
		p4.significado = "Trabalho; qualquer atividade feita por obrigação ou de maneira voluntária.";
		
		Palavra p5 = new Palavra();
		p5.verbete = "Peculiar";
		p5.significado = "Que faz parte da constituição ou da natureza dessa pessoa ou coisa; inerente: ele sempre teve um comportamento muito peculiar.";
		
		Palavra p6 = new Palavra();
		p6.verbete = "Fato";
		p6.significado = "Acontecimento acabado; evento, ocorrência: a fiscalização das barracas ilegais é agora um fato.";
		
		Dicionario dic = new Dicionario();
		dic.adicionarPalavra(p0);
		dic.adicionarPalavra(p1);
		dic.adicionarPalavra(p2);
		dic.adicionarPalavra(p3);
		dic.adicionarPalavra(p4);
		dic.adicionarPalavra(p5);
		dic.adicionarPalavra(p6);
		
		Palavra px = new Palavra();
		px.verbete = "Palestra";
		
		try {
			px = dic.buscarPalavra(px);
			System.out.println(px.toString());
			
			dic.removePalavra(px);
			
			String caracter = "p";
			dic.listaPorCaracter(caracter);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
}

}
