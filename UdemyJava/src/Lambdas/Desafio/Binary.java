package Lambdas.Desafio;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import Lambdas.Produto;

public class Binary {
	public static void main(String[] args) {
		Produto p = new Produto("Bala", 1.5 , 0.1);
		
		Function<Produto, Double> precoRealComDesconto = 
				valor -> valor.getPreco() - (1 * valor.getDesconto());
//		System.out.println(precoRealComDesconto.apply(p));
				
			
		Double valorImposto = 1 * 0.85;
		UnaryOperator<Double> impostoMunicipal = imposto -> imposto >= 2500 ? (imposto + valorImposto) :  imposto;		
//		System.out.println(precoRealComDesconto.andThen(impostoMunicipal).apply(p));

		UnaryOperator<Double> frete = valorFrete -> valorFrete<3000 ? (valorFrete+50) : (valorFrete+100);
//		System.out.println(precoRealComDesconto.andThen(frete).apply(p));
		
		DecimalFormat casas = new DecimalFormat("####.##");
		casas.applyPattern("R$ ###.00");
		Function<Double, String> arredondamentoCasas = preco -> casas.format(preco);
		System.out.println(precoRealComDesconto.andThen(arredondamentoCasas).apply(p));
		
		
		String valorReal = precoRealComDesconto.
					   andThen(impostoMunicipal).
					   andThen(frete).
					   andThen(arredondamentoCasas).
					   apply(p);
		
		System.out.println("O valor real do produto: "+ valorReal);
				
		
	}
}

