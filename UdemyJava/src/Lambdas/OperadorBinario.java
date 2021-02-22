package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
	public static void main(String[] args) {
		BinaryOperator<Double> media = (Double n1, Double n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(212.2, 980.9));
		
		//crir funções fora da inteface
		BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) /2) >= 7 ? "Aprovado":"Reprovado";
		//pode colocar em uma constante e um return.
		
		System.out.println(resultado.apply(7.2,8.9));
	} 
}