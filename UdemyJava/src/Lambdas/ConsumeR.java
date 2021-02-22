package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumeR {
	public static void main(String[] args) {
		String n = "Elasdame";
		
		Consumer<String> imprimir = valor -> System.out.println(valor);
		imprimir.accept(n);

		String n1 = "Elasdame";
		String n2 = "Akja";
		String n3 = "Powe";
		String n4 = "Cesas";
		String n5 = "Diunio";
		String n6 = "Fuoais";
		
		List<String> nomes = Arrays.asList(n1,n2,n3,n4,n5,n6);
		System.out.println("Consumer em Listas e forEach");
		nomes.forEach(imprimir);
	}	
}
