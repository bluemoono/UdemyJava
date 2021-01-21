package Fundamentos.Desafio;

public class Logicos {
	public static void main(String[] args) {
		boolean terca = false;
		boolean quinta = true;
		
		boolean tv50 = terca && quinta;
		boolean tv32 = terca ^ quinta;
		
		boolean sorvete = tv50 || tv32;
		
		boolean passeio = !tv50 || !tv32;
		
		boolean saudavel = !sorvete;
		
		System.out.println("Tv50': "+tv50);	
		System.out.println("Tv32': "+tv32);	
		System.out.println("Sorvete: "+sorvete);	
		System.out.println("Passeio': "+passeio);
		System.out.println("Saudavel: "+saudavel);
	}
}
