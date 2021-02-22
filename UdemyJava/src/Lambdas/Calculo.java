package Lambdas;

//s� recebe uma Lambda(fun��o anonima) dentro da classe
@FunctionalInterface
public interface Calculo {
	double executar(double a, double b);
	
	//em explos default ta tudo certo, pois n�o � 
	//necess�rio a inclusao dentro da classe
	default String legal() {
		return"legal";
	}
	//basicamente, 1 m�todo abstrato
	static String massa() {
		return "massa";
	}
}