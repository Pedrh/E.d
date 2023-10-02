package controller;

import model.Fila;

public class ImpressoraController {

	Fila<Documento> fila;
	Documento documentoPrincipal = new Documento();
	public ImpressoraController() {
		super();
	}
	
	public void insereDocumento(Fila<Documento> fila, String documento) {
		String infos[] =  documento.split(";");
		documentoPrincipal.ID_pc = Integer.parseInt(infos[0]);
		documentoPrincipal.Nome_arquivo = infos[1];
		fila.insert(documentoPrincipal);
		
		System.out.println("Id: " + documentoPrincipal.ID_pc + ", Nome: " + documentoPrincipal.Nome_arquivo +" Foi inserido");
	}
	
	public void imprime(Fila<Documento> fila){
		if(fila.isEmpty()) {
			System.err.println("Fila de impressão vazia");
		}else {
			while(!fila.isEmpty()) {
				try {
					documentoPrincipal = fila.remove();
					System.out.println(documentoPrincipal +" está sendo impresso");
					float tempo = (float) (Math.random() * 2.01) + 1;
					Thread.sleep((long) (tempo * 1000));
					System.out.println(documentoPrincipal+" Foi impresso");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}
		
	}
	
}
