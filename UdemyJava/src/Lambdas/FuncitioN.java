package Lambdas;

import java.util.function.Function;

public class FuncitioN {
	public static void main(String[] args) {
		Function<Integer, String> parImpar = numero -> numero%2 == 0 ? "Par" : "Impar";
		
		System.out.println(parImpar.apply(52452963));
		
		Function<String, String> resultado = valor -> "Resultado: " + valor;
		
		String resultadoFinal = parImpar.andThen(resultado).apply(42);
		
		System.out.println(resultadoFinal);
	}
}
