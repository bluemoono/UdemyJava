package OrientadoObjeto.Abstrato;

public class Teste {
	public static void main(String[] args) {
		Mamifero c = new Cachorro();
		
		System.out.println(c.mover());
		System.out.println(c.mamar());
	}
}
