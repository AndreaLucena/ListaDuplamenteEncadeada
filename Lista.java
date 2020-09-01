package listaDuplamenteEncadeada;

public class Lista<Node> {
	
	private Node anterior;
	private Node proximo;
	private String valor;
	
	public Lista(Node anterior, Node proximo, String valor){
		this.anterior = null;
		this.proximo = null;
		this.valor = valor;
	}

	public Node getAnterior() {
		return this.anterior;
	}

	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}

	public Node getProximo() {
		return this.proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}


	
}