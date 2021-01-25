package ArrayCollections;

import java.util.HashSet;
import java.util.Set;

public class SetBagunçado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		//converte automático
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(3);
		conjunto.add('x');
		
		//para saber o tamanho
		System.out.println("Tamanho: "+conjunto.size()+"\n");
		
		//remover
		System.out.println(conjunto.remove('x'));
		System.out.println("Tamanho: "+conjunto.size());
		
		//verificar se existe
		System.out.println(conjunto.contains(1.2));
		
		//interferencia de dois tipos de coleções
		Set numero = new HashSet();
		numero.add(1);
		numero.add(2);
		numero.add(3);
		
		System.out.println(numero);
		
		//ligar ou agrupar as duas coleçções
		conjunto.addAll(numero);
		System.out.println(conjunto);
		
		//interecção 
		conjunto.retainAll(numero);
		System.out.println(conjunto);
		
		//limpar
		conjunto.clear();
		System.out.println(conjunto);

	}
}
