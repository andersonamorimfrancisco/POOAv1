package AV1;

public class App {
	
	public static int MAX = 5;
	
	public static Pessoa[] lista = new Pessoa[MAX];

	public static void main(String[] args) {
		exercicio01();
		exercicio02();
		exercicio03();
		exercicio04();
	}
	
	
	// Exercicio 01
	public static void exercicio01(){
		System.out.println("");
		System.out.println("Exercicio 01: Imprimir nome considerando ordem de idade");
		
		lista[0] = new Pessoa("João", 10);
		lista[1] = new Pessoa("Alice", 5);
		lista[2] = new Pessoa("Fernando", 27);
		lista[3] = new Pessoa("Carlos", 12);
		lista[4] = new Pessoa("Priscila", 31);
		
		
		// Buble Sort
		boolean encontrou;
		Pessoa temp;
		
		do {
			encontrou = false;
			
			for(int i = 0; i < lista.length - 1; i++) {
				if(lista[i + 1].getIdade() < lista[i].getIdade()) {
					temp = lista[i];
					lista[i] = lista[i + 1];
					lista[i + 1] = temp;
					encontrou = true;
				}
			}
			
		}while(encontrou);
		
		// Imprimindo
		for(int i = 0; i < lista.length; i++) {
			System.out.println(lista[i].getNome());
		}
		
		
	}
	// Exercicio 02
	public static void exercicio02(){
		System.out.println("");
		System.out.println("Exercicio 02: Remover registros com idade = 27");	
		Pessoa.resetarContador();
		
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
		
		for(int i = 0; i < lista.length; i++) {
			if(lista[i] != null) {
				System.out.println(lista[i].getNome());
			}
		}
	}
	
	// Exercicio 03
	public static void exercicio03(){
		System.out.println("");
		System.out.println("Exercicio 03: Imprimir somente maiores de 21 anos");
		
		Pessoa.resetarContador();
		
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
			
			System.out.println("");
			System.out.println("Exercicio 04: Utilizar sistema de cache");
			
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