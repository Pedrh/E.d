package testePilha;

import model.pilhaInt;

public class view {

	public static void main(String[] args) throws Exception {
		pilhaInt p =new pilhaInt();
		
		p.push(1);
		p.push(2);
		p.push(3);
		
		int topo = p.top();
		System.out.println(topo);
	}

}
