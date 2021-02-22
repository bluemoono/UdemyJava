package Lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		Predicate<Produto> isCaro = 
				produto -> (produto.preco * (1 - produto.desconto)) >= 1.5;
		
		Produto n = new Produto("Lapis", 5.5, 0.5);
		System.out.println(isCaro.test(n));
		
		
		Predicate<Integer> isPar = num -> num%2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <=1000;
		
		System.out.println(isPar.test(312));
		System.out.println(isTresDigitos.test(312));
		System.out.println(isPar.and(isTresDigitos).test(312));
	}
}
