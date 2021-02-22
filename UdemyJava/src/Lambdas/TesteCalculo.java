package Lambdas;

import java.util.function.BinaryOperator;

public class TesteCalculo {
	public static void main(String[] args) {
		Calculo soma = new Soma();
		Calculo multiplicar = new Multiplicar();
		
		System.out.println(soma.executar(3, 6));
		System.out.println(multiplicar.executar(3, 6));
		
		//FUNÇÕES LAMBDAS
		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(4, 2));
		
		calc = (x, y) -> x * y;		
		System.out.println(calc.executar(4, 2));
		
		//calc 03 - Usando Bynary
		
		BinaryOperator<Double> calc1 = (x, y) -> x + y;
		System.out.println(calc1.apply(2.0, 3.0));
	} 
}
