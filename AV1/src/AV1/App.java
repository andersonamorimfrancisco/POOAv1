package AV1;

public class App {
	
	public static int MAX = 5;
	
	public static Pessoa[] lista = new Pessoa[MAX];

	public static void main(String[] args) {
		
		lista[0] = new Pessoa("João", 10);
		lista[1] = new Pessoa("Alice", 5);
		lista[2] = new Pessoa("Fernando", 27);
		lista[3] = new Pessoa("Carlos", 12);
		lista[4] = new Pessoa("Priscila", 31);
		
		imprimirEmOrdemIdade();
		
	}
	
	public static void listar() {
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] != null) {
				System.out.println(lista[i].nome);
			}
		}
	}
	
	public static void removerPorIdade(int idade) {
		for (int i = 0; i < lista.length; i++) {
			if(lista[i].idade == idade) {
				lista[i] = null;
			}
		}
		
		listar();
	}
	
	public static void imprimirComIdadeMaior(int idade) {
		for (int i = 0; i < lista.length; i++) {
			if(lista[i].idade > idade) {
				System.out.println(lista[i].id + " - " + lista[i].nome + " - " + lista[i].idade);
			}
		}
	}
	
	public static void imprimirEmOrdemIdade() {
		int idMenorIdade = encontrarIdMenorIdade();
		
		
		
		System.out.println(idMenorIdade);
	}
	public static int encontrarIdMenorIdade() {
		int id = lista[0].id;
		int idadeInicial = lista[0].idade;
		
		for (int i = 0; i < lista.length; i++) {
			if(lista[i].idade < idadeInicial) {
				id = lista[i].id;
			}
		}
		
		return id;
	}
	
}