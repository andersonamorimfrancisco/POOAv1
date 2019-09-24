package AV1;

public class CachePessoa {
	
	public static Pessoa[] listaCache = new Pessoa[App.MAX];
	public static int contador = 0;
	
	public void retornaPessoa(int id) {
		
		// Buscar no Cache
		boolean encontrou = false;
		
		
		for (int i = 0; i < contador; i++) {
			if(listaCache[i].getId() == id) {
				System.out.println("Do Cache | Nome: " + listaCache[i].getNome() + ", Idade: " + listaCache[i].getIdade());
				encontrou = true;
			}
		}
		
		// Buscar na lista
		if(encontrou == false) {
			for (int i = 0; i <  App.lista.length; i++) {
				if(App.lista[i] != null) {
					if(App.lista[i].getId() == id) {
						listaCache[contador] = App.lista[i];
						System.out.println("Da Lista | Nome: " + listaCache[contador].getNome() + ", Idade: " + listaCache[contador].getIdade());
						contador++;
					}
				}
			}
		}
		
	}

}
