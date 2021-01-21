package Fundamentos.Desafio;

import java.util.Scanner;

public class Conversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salario:");
		String v1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo salario:");
		String v2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro salario:");
		String v3 = entrada.nextLine().replace(",", ".");
		
		double s1 = Double.parseDouble(v1);
		double s2 = Double.parseDouble(v2);
		double s3 = Double.parseDouble(v3);
		
		double media = (s1+s2+s3)/3;
		System.out.println("A média dos salários: "+media);
		
		
		
		entrada.close();
	}
}
