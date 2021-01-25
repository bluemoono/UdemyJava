package ArrayCollections;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Fabio"));
		usuarios.add(new Usuario("Guilherme"));
		
		boolean resultado = usuarios.contains(new Usuario("Guilherme"));
		System.out.println(resultado);
	}
}
