package view;

import controller.Rehashing;
import fateczl.Lista.model.Lista;

public class Principal {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Rehashing rehashing = new Rehashing();
		Lista<Integer>[] lista = new Lista[10];
		
		int tamanho = lista.length;
		for(int i = 0; i < tamanho; i++) {
			lista[i] = new Lista<>();
		}
		
		//adicionando os valores da tabela anterior
		
		//primeira posicao
		lista[0].addFirst(467);
		lista[0].addFirst(136);
		lista[0].addFirst(158);
		lista[0].addFirst(647);
		lista[0].addFirst(12);
		
		
		
		//segunda posicao
		lista[1].addFirst(551);
		lista[1].addFirst(600);
		lista[1].addFirst(156);
				
		
		//terceira posicao
		lista[2].addFirst(629);
		lista[2].addFirst(933);
		lista[2].addFirst(914);
		lista[2].addFirst(945);
		lista[2].addFirst(882);
		lista[2].addFirst(414);
		lista[2].addFirst(263);
		
		//quarta posicao
		lista[3].addFirst(513);
		lista[3].addFirst(194);
		lista[3].addFirst(795);
		lista[3].addFirst(884);
		
		//quinta posicao
		lista[4].addFirst(979);
		lista[4].addFirst(337);
		lista[4].addFirst(66);
		lista[4].addFirst(847);
		lista[4].addFirst(591);
		
		//sexta posicao
		lista[5].addFirst(53);
		lista[5].addFirst(768);
		
		//setima posicao
		lista[6].addFirst(550);
		lista[6].addFirst(339);
		lista[6].addFirst(90);
		lista[6].addFirst(803);
		lista[6].addFirst(114);
		
		//oitava posicao
		lista[7].addFirst(88);
		lista[7].addFirst(617);
		lista[7].addFirst(99);
		lista[7].addFirst(216);
		lista[7].addFirst(977);
		lista[7].addFirst(574);
		
		//nona posicao
		lista[8].addFirst(206);
		lista[8].addFirst(338);
		lista[8].addFirst(585);
		lista[8].addFirst(939);
		lista[8].addFirst(227);
		lista[8].addFirst(148);
		lista[8].addFirst(142);
		
		//decima posicao
		lista[9].addFirst(844);
		lista[9].addFirst(708);
		lista[9].addFirst(569);
		
		
		try {
		for(int posicao = 0; posicao < tamanho; posicao++) {
			int tamanhoLista = lista[posicao].size();
			for(int i = 0; i < tamanhoLista; i++) {
				rehashing.adicionaNovaLista(lista[posicao].get(i));
			}
		}
		
		
		rehashing.mostraLista();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
