package AV1;

public class App {
	
	public static int MAX = 5;
	
	public static Pessoa[] lista = new Pessoa[MAX];

	public static void main(String[] args) {
		exercicio01();
		exercicio04();
		//exercicio03();
		//exercicio02();
	}
	
	
	// Exercicio 01
	public static void exercicio01(){
		
		lista[0] = new Pessoa("João", 10);
		lista[1] = new Pessoa("Alice", 5);
		lista[2] = new Pessoa("Fernando", 27);
		lista[3] = new Pessoa("Carlos", 12);
		lista[4] = new Pessoa("Priscila", 31);
		
		int menorIdade = lista[0].getIdade();
		
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] != null) {
				
			}
		}
		
	}
	// Exercicio 02
	public static void exercicio02(){
		
		lista[0] = new Pessoa("João", 10);
		lista[1] = new Pessoa("Alice", 5);
		lista[2] = new Pessoa("Fernando", 27);
		lista[3] = new Pessoa("Carlos", 12);
		lista[4] = new Pessoa("Priscila", 31);
		
		for (int i = 0; i < lista.length; i++) {
			if(lista[i].getIdade() == 27) {
				lista[i] = null;
			}
		}
	}
	
	// Exercicio 03
	public static void exercicio03(){
		
		lista[0] = new Pessoa("Paulo", 8);
		lista[1] = new Pessoa("Silas", 19);
		lista[2] = new Pessoa("Paulo", 18);
		lista[3] = new Pessoa("Pedro", 25);
		lista[4] = new Pessoa("Paulo", 50);
		
		for (int i = 0; i < lista.length; i++) {
			if(lista[i].getIdade() > 21) {
				System.out.println(lista[i].getId() + " - " + lista[i].getNome() + " - " + lista[i].getIdade());
			}
		}
			
	}
	
	// Exercicio 04
		public static void exercicio04(){
			
			Pessoa.resetarContador();
			
			CachePessoa cache = new CachePessoa();
			
			lista[0] = new Pessoa("Paulo", 8);
			lista[1] = new Pessoa("Silas", 19);
			lista[2] = new Pessoa("Paulo", 18);
			lista[3] = new Pessoa("Pedro", 25);
			lista[4] = new Pessoa("Paulo", 50);
			
			cache.retornaPessoa(4); // Primeira vez que busca essa id, então retornara da lista
			cache.retornaPessoa(1); // Primeira vez que busca essa id, então retornara da lista
			cache.retornaPessoa(4); // Segunda vez que busca essa id, então retornara do cache
			
		}
		
}