package Fundamentos.Desafio;

public class Aritmeticos {
	public static void main(String[] args) {
		double aaa = Math.pow(6*(3+2), 2);
		double aab = 3*2;
		double aba = (1-5)*(2-7);
		double abb = 2;
		double ab = Math.pow(aba/abb, 2);
		
		double a = Math.pow(aaa/aab - ab, 3);
		double b = Math.pow(10, 3);
		
		double r = a/b;
		
		System.out.println("O resultado é: "+r);
	}
}
