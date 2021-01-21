package Fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Texto".charAt(3));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s+"!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println(s.equals("boa tarde"));
		
		var nome = "Sabio";
		var sobrenome = "Golçalves";
		var idade = 45;
		var salario = 13_789.5479;
		
		System.out.printf("Nome: %s %s \nIdade: %d \nSalario: %.2f", nome, sobrenome, idade, salario);
		
		System.out.println("Uma frase qualquer, um lugar qualquer".contains("qual"));
		System.out.println("Uma frase qualquer, um lugar qualquer".indexOf(4));
		System.out.println("Uma frase qualquer, um lugar qualquer".substring(15));
		System.out.println("Uma frase qualquer, um lugar qualquer".substring(15, 24));
	}
}
