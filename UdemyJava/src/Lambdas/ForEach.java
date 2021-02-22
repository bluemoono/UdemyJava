package Lambdas;

import java.util.Arrays;
import java.util.List;


public class ForEach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bruno", "Carolina", "Diego");
		
		System.out.println("Lista tradicional");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("Com Lambdas 01:");
		aprovados.forEach((nome) ->{ System.out.println(nome+ "!");});
		
		System.out.println("\nCom Lambdas 02:");
		aprovados.forEach( nome -> imprimir(nome));
		
		System.out.println("\nMethod Referene 01:");
		
		//referenia o metodo chamando cada um para ser imprimido
		aprovados.forEach(System.out::println);
		
		System.out.println("\nMethod Referene 02:");
		aprovados.forEach(ForEach::imprimir);
	}
	
	static void imprimir(String nome) {
		System.out.println("Nome: "+ nome);
	}
}
