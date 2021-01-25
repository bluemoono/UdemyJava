package ArrayCollections;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		java.util.List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Testa");
		lista.add(u1);
		
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Bruno"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Duda"));
		lista.add(new Usuario("Emerson"));
		
		lista.remove(1);
		System.out.println(lista.remove(new Usuario("Remoção")));
		
		for (Usuario usuario : lista) {
			System.out.println(usuario.nome);
		}
	}
}
