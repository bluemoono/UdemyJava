package Fundamentos.Desafio;

public class Temperatura {
	public static void main(String[] args) {
		double fahrenheit = 90;
		final double MENOS = 32;
		final double PERCENT= 5/9.0;
		
		double calculo = (fahrenheit - MENOS)*PERCENT;
		
		System.out.println("A temperatura em Celsius é: " + calculo); 
	}
}
