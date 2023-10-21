package setLista.model;

public class No<T> {

	T dado;
	No<T> proximo;
	
	public String toString() {
		return (String)dado;
	}
}
