package Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnirio {
	public static void main(String[] args) {
		UnaryOperator<Integer> somaDois = n -> n+2; 
		UnaryOperator<Integer> menosDois = n -> n-2; 
		UnaryOperator<Integer> somaQuadrado = n -> n*n; 
		
		System.out.println(somaDois.andThen(somaQuadrado).andThen(menosDois).apply(2));
	}
}
