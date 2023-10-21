package setLista.model;

public class setLista<T> {

	No<T> primeiro;

	public setLista() {
		primeiro = null;
	}

	public boolean isEmpty() {
		if (primeiro == null) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isAdded(T valor) {
		try {
			int tamanho = size();
			for (int i = 0; i < tamanho; i++) {
				if (valor == get(i)) {
					return true;
				}
			}
		} catch (Exception e) {
		}
		return false;
	}

	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			No<T> auxiliar = primeiro;
			while (auxiliar != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}

	private No<T> getNo(int posicao) throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista vazia");
		}
		int tamanho = size();
		if (posicao < 0 || posicao > tamanho - 1) {
			throw new Exception("Posição inválida");
		}

		int cont = 0;
		No<T> auxiliar = primeiro;
		while (cont < posicao) {
			auxiliar = auxiliar.proximo;
			cont++;
		}

		return auxiliar;
	}

	public void addFirst(T valor) throws Exception {
		if (isAdded(valor)) {
			throw new Exception("Esse valor já está na lista");
		} else {
			No<T> elemento = new No<>();
			elemento.dado = valor;
			elemento.proximo = primeiro;
			primeiro = elemento;
		}
	}

	public void addLast(T valor) throws Exception {
		if (isEmpty()) {
			addFirst(valor);
		}
		if (isAdded(valor)) {
			throw new Exception("Esse valor já está na lista");
		} else {
			int tamanho = size();
			No<T> elemento = new No<>();
			elemento.dado = valor;
			elemento.proximo = null;
			No<T> ultimo = getNo(tamanho - 1);
			ultimo.proximo = elemento;
		}

	}

	public void add(T valor, int posicao) throws Exception {
		int tamanho = size();
		if (isAdded(valor)) {
			throw new Exception("Esse valor já está na lista");
		} else if (posicao < 0 || posicao > tamanho) {
			throw new Exception("Posição inválida");
		}
		if (posicao == 0) {
			addFirst(valor);
		} else if (posicao == tamanho) {
			addLast(valor);
		} else {
			No<T> anterior = getNo(posicao - 1);
			No<T> elemento = new No<>();
			elemento.dado = valor;
			elemento.proximo = anterior.proximo;
			anterior.proximo = elemento;
		}
	}

	public void removeFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista vazia");
		}
		primeiro = primeiro.proximo;
	}

	public void removeLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista vazia");
		}
		int tamanho = size();
		if (tamanho == 1) {
			removeFirst();
		} else {
			No<T> penultimo = getNo(tamanho - 2);
			penultimo.proximo = null;
		}
	}

	public void remove(int posicao) throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista vazia");
		}
		int tamanho = size();
		if (posicao < 0 || posicao > tamanho - 1) {
			throw new Exception("Posição inválida");
		}
		if (posicao == 0) {
			removeFirst();
		} else if (posicao == tamanho - 1) {
			removeLast();
		} else {
			No<T> anterior = getNo(posicao - 1);
			No<T> atual = getNo(posicao);
			anterior.proximo = atual.proximo;

		}
	}

	public T get(int posicao) throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista vazia");
		}
		int tamanho = size();
		if (posicao < 0 || posicao > tamanho - 1) {
			throw new Exception("Posição inválida");
		}
		No<T> elemento = getNo(posicao);
		return elemento.dado;
	}

	public void ShowList() {
		for (int i = 0; i < size(); i++) {
			try {
				System.out.print(get(i) + "; ");
			} catch (Exception e) {
			}
		}
	}
}
