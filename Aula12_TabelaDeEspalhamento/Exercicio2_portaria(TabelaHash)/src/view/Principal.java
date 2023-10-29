package view;

import controller.PortariaController;
import model.Morador;

public class Principal {

	public static void main(String[] args) {
		PortariaController portaria = new PortariaController();
		
		
		Morador morador01 = new Morador(1003, 10, "Marcio" , "Sedan" , "azul" , "EJE8007");
		Morador morador02 = new Morador(701, 7, "Vania" , "Tucson" , "rosa" , "J32GMB19");
		Morador morador03 = new Morador(715, 7, "Lucas" , "Golf GTI" , "prata" , "JJ6F321");
		Morador morador04 = new Morador(102, 1, "Karina" , "Camaro" , "amarelo" , "XOXO0055");
		Morador morador05 = new Morador(101, 1, "Felipe" , "Fusca" , "preto" , "F124VC0");
		Morador morador06 = new Morador(104, 1, "Tati" , "Mini-Van" , "roxo" , "093KKHJ5");
		Morador morador07 = new Morador(309, 3, "Celestio" , "Ônibus" , "verde" , "K5564FG3");
		
		try {
			portaria.cadastraMorador(morador01);
			portaria.cadastraMorador(morador02);
			portaria.cadastraMorador(morador03);
			portaria.cadastraMorador(morador04);
			portaria.cadastraMorador(morador05);
			portaria.cadastraMorador(morador06);
			portaria.cadastraMorador(morador07);
			
			Morador encontrarMorador = new Morador();
			encontrarMorador.nome = "Karina";
			encontrarMorador.andar = 1;
			portaria.consultaMorador(encontrarMorador);
			
			Morador excluirMorador = new Morador();
			excluirMorador.nome = "Felipe";
			excluirMorador.andar = 1;
			portaria.excluirMorador(excluirMorador);
			
			encontrarMorador = new Morador();
			encontrarMorador.nome = "Felipe";
			encontrarMorador.andar = 1;
			portaria.consultaMorador(encontrarMorador);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
