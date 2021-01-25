package ArrayCollections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {
	public static void main(String[] args) {
		java.util.Set<String> listaAprovado = new TreeSet<String>();
		
		listaAprovado.add("Somente String");//aceita somente string
		listaAprovado.add("Ana");
		listaAprovado.add("Bruno");
		listaAprovado.add("Carol");
		listaAprovado.add("Diego");
		
		for (String candidato : listaAprovado) {
			System.out.println(candidato);
		}
		
		
		java.util.Set<Integer> nums = new HashSet<>();
		
		nums.add(1);//aceita somente inteiros
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
//		nums.get(1) - não é possível aessar pelo indice
		
		for (int integer : nums) {
			System.out.println(integer);
		}
	}
}
