package br.edu.fateczl.arvore.caractere.ArvoreChar;


public class ArvoreChar {
	No raiz;
	
	public ArvoreChar() {
		raiz = null;
	}
	
	public void insert( char valor) {
		No no = new No();
		no.dado = valor;
		no.direita = null;
		no.esquerda = null;
		insertLeaf(raiz, no);
	}
	
	
	private void insertLeaf(No raizSubArvore, No no) {
		if(raiz == null){
			raiz = no;
		} else {
			if(no.dado < raizSubArvore.dado) {
				if(raizSubArvore.esquerda ==null) {
					raizSubArvore.esquerda = no;
				} else {
					insertLeaf(raizSubArvore.esquerda, no);
				}
			}
			if(no.dado > raizSubArvore.dado) {
				if(raizSubArvore.direita ==null) {
					raizSubArvore.direita = no;
				}else {
					insertLeaf(raizSubArvore.direita, no);
				}
			}
		}
	}
	
	public void search(char valor) {
			try {
				No no = nodeSearch(raiz, valor);
				int level = nodeLevel(raiz, valor);
				System.out.println((char) no.dado + ": nivel " + level);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
	}

	private No nodeSearch(No raizSubArvore, char valor) throws Exception {
		if(raiz ==null) {
			throw new Exception("Arvore vaiza");
		} else if(raizSubArvore.dado > valor) {
			return nodeSearch(raizSubArvore.esquerda, valor);
		} else if(raizSubArvore.dado < valor) {
			return nodeSearch(raizSubArvore.direita, valor);
		} else {
			return raizSubArvore;
		}
		
	}

	private int nodeLevel(No raizSubArvore, char valor) throws Exception {
		if(raiz ==null) {
			throw new Exception("Arvore vaiza");
		} else if(raizSubArvore.dado > valor) {
			return 1 + nodeLevel(raizSubArvore.esquerda, valor);
		} else if(raizSubArvore.dado < valor) {
			return 1 + nodeLevel(raizSubArvore.direita, valor);
		} else {
			return 0;
		}
		
	}
	
	public void prefixSearch() throws Exception {
		prefix(raiz);
	}

	private void prefix(No raizSubAvore) throws Exception {
		if(raiz == null) {
			throw new Exception("Arvore vazia");
		}
		System.out.print((char) raizSubAvore.dado + " ");
		if(raizSubAvore.esquerda !=null) {
			prefix(raizSubAvore.esquerda);
		}
		if(raizSubAvore.direita != null) {
			prefix(raizSubAvore.direita);
		}
	}
	
	public void infixSearch() throws Exception {
		infix(raiz);
	}

	private void infix(No raizSubAvore) throws Exception {
		if(raiz == null) {
			throw new Exception("Arvore vazia");
		}
		if(raizSubAvore.esquerda !=null) {
			infix(raizSubAvore.esquerda);
		}
		System.out.print((char) raizSubAvore.dado + " ");
		if(raizSubAvore.direita != null) {
			infix(raizSubAvore.direita);
		}
	}
	
	public void postfixSearch() throws Exception {
		postfix(raiz);
	}

	private void postfix(No raizSubAvore) throws Exception {
		if(raiz == null) {
			throw new Exception("Arvore vazia");
		}
		if(raizSubAvore.esquerda !=null) {
			postfix(raizSubAvore.esquerda);
		}
		if(raizSubAvore.direita != null) {
			postfix(raizSubAvore.direita);
		}
		System.out.print((char) raizSubAvore.dado + " ");
	}
	
	
	public void remove(char valor) {
		try {
		removeChild(raiz, valor);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private void removeChild(No raizSubArvore, char valor) throws Exception {
		No no = nodeSearch(raiz, valor);
		No pai = nodeParent(null, raiz, valor);
		if(no.direita != null && no.esquerda != null) { //Nó tem 2 filhos
			No noTroca = no.esquerda;
			while(noTroca.direita != null) { //Nó mais a direita da 
				noTroca = noTroca.direita; //subarvore a esquerda
			}
			pai = nodeParent(null, raiz, (char) noTroca.dado);
			no.dado = noTroca.dado;
			noTroca.dado = valor;
			removeOneOrZeroLeaf(pai, noTroca);
		}else {//Nó tem 1 ou 0 filhos
			removeOneOrZeroLeaf(pai, no);
		}
	}

	
	private No nodeParent(No parent, No raizSubArvore, char valor) throws Exception {
		if(raiz ==null) {
			throw new Exception("Arvore Vazia");
		}
		if(raizSubArvore.dado > valor) {
			return nodeParent(raizSubArvore, raizSubArvore.esquerda, valor);
		} else if(raizSubArvore.dado < valor) {
			return nodeParent(raizSubArvore, raizSubArvore.direita, valor);
		} else {
			if(parent ==null) {
				return raiz;
			}else {
				return parent;
			}
		}
	}
	
	private void removeOneOrZeroLeaf(No pai, No no) {
		if(no.esquerda == null && no.direita == null) {
			change(pai, no, null);
		} else if(no.esquerda == null){
			change(pai, no, no.direita);
		} else if(no.direita == null) {
			change(pai, no, no.esquerda);
		}
	}

	private void change(No pai, No no, No novoNo) {
		if(pai.esquerda != null && pai.esquerda.dado == no.dado) {
			pai.esquerda = novoNo;
		} else if(pai.direita.dado == no.dado) {
			pai.direita = novoNo;
		}
	}

}
