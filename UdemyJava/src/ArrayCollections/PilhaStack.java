package ArrayCollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class PilhaStack {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("A seleção");
		livros.push("Dom quixote");
		livros.push("trono de vidro");
		
		System.out.println(livros.peek());
		
		for(String livro: livros) {
			System.out.println(livro);
		}
	}
}
