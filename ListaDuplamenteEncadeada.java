package listaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T>{
	
	//Declaração de variáveis
	private Node<T> primeiro;
	private Node<T> ultimo;
	private int tamanho;
	
	//Construtor
	public ListaDuplamenteEncadeada(Node primeiro, Node ultimo, int quant){
		this.primeiro = null;
		this.ultimo = null;
		this.tamanho = 0;
	}
	//Gets&Sets
	public Node getPrimeiro() {
		return this.primeiro;
	}
	public void setPrimeiro(Node primeiro) {
		this.primeiro = primeiro;
	}
	public Node getUltimo() {
		return this.ultimo;
	}
	public void setUltimo(Node ultimo) {
		this.ultimo = ultimo;
	}
	public int getQuant() {
		return this.tamanho;
	}
	public void setQuant(int tamanho) {
		this.tamanho = tamanho;
	}
	/**
	 * Verifica se a Lista Dupla está vazia
	 * @return true/false
	 */
	public boolean isEmpty(){
		if (this.primeiro == null){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * Verifica o tamanho da Lista Dupla
	 * @throws Exception se a Lista estiver vazia 
	 */
	public int length()throws Exception{
		if (this.primeiro != null){
			return this.tamanho;
		}else{
			throw new Exception("Lista vazia.");
		}
	}
	/**
	 * Adiciona um nó no final da Lista Dupla
	 * @param valor O valor a ser adicionado na Lista Dupla
	 */
	public void inserirFinal(T valor){
		Node no = new Node(valor);		
		no.setProximo(null);
		no.setAnterior(null);
		if (this.primeiro == null){
			this.primeiro = no;
			this.ultimo = no;
		}
		ultimo.setProximo(no);
		no.setAnterior(ultimo);
		no.setDepois(null);
		this.ultimo = no;
		quant+=1;
	}
	
	/**
	 * Remove o último nó da Lista Dupla
	 * @throws Exception se a Lista estiver vazia 
	 */
	public void removerFinal() throws Exception{
		if (this.primeiro == null){
			throw new Exception("Lista vazia.");
		}
		this.ultimo = ultimo.getAnterior();
		this.ultimo.setProximo(null);
		quant-=1;
		}
	
	/**
	 * Verifica a ocorrência de um valor na Lista Dupla
	 * @param valor
	 * @return true/false
	 */
	public boolean contem(T valor){
		
		if (this.primeiro == null){
			return false;
		}
		for (Node no = primeiro; primeiro != null; no=no.getProximo()){
			if(no.getValor().equals(valor)){
				return true;
			}
		}
		return false;
	
	}
	/**
	 * Limpa a Lista Dupla
	 */
	public void clear(){
		this.primeiro = null;
		this.ultimo = null;
		this.tamanho = 0;
	}
}
