package AV1;

public class Pessoa {
	
	// Variavel do Classe
	static int contador = 0;
	
	static void resetarContador() {
		contador = 0;
	}

	// Variavel do Objeto
	private int id;
	private String nome;
	private int idade;
		
	public Pessoa(String nome, int idade) {
		
		this.id = ++contador;
		this.nome = nome;
		this.idade = idade;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


}
