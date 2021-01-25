package ArrayCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuario = new HashMap<Integer, String>();
		
		usuario.put(1, "Ana");
		usuario.put(2, "Bruno");
		usuario.put(3, "Claudio");
		usuario.put(4, "Diana");
		
		System.out.println(usuario.size());
		System.out.println(usuario.isEmpty());
		System.out.println(usuario.keySet());
		System.out.println(usuario.values());
		System.out.println(usuario.entrySet());

		System.out.println(usuario.containsKey(2));
		System.out.println(usuario.containsValue("Ana"));
		
		System.out.println(usuario.get(3));	
		
		for(int chave: usuario.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuario.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuario.entrySet()) {
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
		}
	}
}
