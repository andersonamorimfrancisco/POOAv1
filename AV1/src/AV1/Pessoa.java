package AV1;

public class Pessoa {
	
	// Variavel do Classe
	static int contador = 0; 

	// Variavel do Objeto
	int id;
	String nome;
	int idade;
		
	public Pessoa(String nome, int idade) {
		
		this.id = ++contador;
		this.nome = nome;
		this.idade = idade;
	
	}

}
