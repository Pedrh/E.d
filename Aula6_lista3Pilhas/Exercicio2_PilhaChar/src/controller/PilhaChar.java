package controller;

import model.PilhaStrings;

public class PilhaChar {

	public PilhaChar() {
		super();
	}
	
	PilhaStrings p = new PilhaStrings();
	PilhaStrings p2 = new PilhaStrings();
	
	public String OrdemAvulsa(String[] vetor) {
		for(int i =0; i < vetor.length ; i++) {
			p.push(vetor[i]);
		}
		
		for(int i =0; i < vetor.length ; i++) {
			try {
				if(i==0 || i==4) {
					p.pop();
				}else if(i==1 || i==3 || i ==5) {
					p2.push(p.pop());
				}else {
					System.out.print(p.pop());
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i =0; i < 5 ; i++) {
			try {
				if(i==0 || i==1 || i==3) {
					p.push(p2.pop());
				} else if(i==2) {
					p.push("m");
				}else {
					p.push("k");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		return"";
	}

}
