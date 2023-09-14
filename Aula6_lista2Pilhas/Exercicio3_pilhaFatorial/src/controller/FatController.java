package controller;

import model.pilhaInt;

public class FatController {

	public FatController() {
		super();
	}
	
	pilhaInt p = new pilhaInt();

	public long fatorial(int n) {
		if(n==1) {
			p.push(n);
			long fat = 1;
			do {
				try {
					fat*= p.pop();
				} catch (Exception e) {
					
				}
			}while(!p.isEmpty());
			
			return fat;
		}
		p.push(n);
		n = n - 1;
		return fatorial(n);
	}

}
