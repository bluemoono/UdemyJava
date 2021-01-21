package ClasseObjeto.Desafio;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("Macarrão", 0.3);
		Comida c2 = new Comida("Carne", 0.4);
		
		Pessoa p = new Pessoa("Ana", 65.5);
		System.out.println("Ana: "+p.peso);
		
		p.comer(c1);
		System.out.println("Ana: "+p.peso);
		
		p.comer(c2);
		System.out.println("Ana: "+p.peso);
	}
}
