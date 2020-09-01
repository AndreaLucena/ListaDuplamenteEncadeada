package listaDuplamenteEncadeada;

public class Principal {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada<T> lista = new ListaDuplamenteEncadeada<T>();
		
		
		lista.isEmpty();
		
		try{
			lista.length();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		lista.inserirFinal(valor);
		
		try{
			lista.removerFinal();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		lista.contem(String);
		
		lista.clear();
	}
}