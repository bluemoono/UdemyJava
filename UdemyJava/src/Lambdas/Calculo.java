package Lambdas;

//só recebe uma Lambda(função anonima) dentro da classe
@FunctionalInterface
public interface Calculo {
	double executar(double a, double b);
	
	//em explos default ta tudo certo, pois não é 
	//necessário a inclusao dentro da classe
	default String legal() {
		return"legal";
	}
	//basicamente, 1 método abstrato
	static String massa() {
		return "massa";
	}
}