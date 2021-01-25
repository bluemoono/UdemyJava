package ArrayCollections;

import java.util.LinkedList;
import java.util.Queue;

public class FilaQueue {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		
		fila.add("Add");
		
		//retorna falso se tiver cheia
		fila.offer("Offer é para tamanhos previos");
		fila.offer("Ana");
		fila.offer("Bruno");
		fila.offer("Carlos");
		fila.offer("David");
		fila.offer("Eleanor");
		
		//pega um elemento, retorna falso se tiver fazio
		System.out.println(fila.peek());
		//pega algum elemento, mas ele trava se tiver fazio
		System.out.println(fila.element());
		
		//remove
//		fila.clear();
		
		fila.poll();
		fila.poll();
		fila.poll();

//		fila.remove(); causa exeção se não tiver mais nada
	}
}
