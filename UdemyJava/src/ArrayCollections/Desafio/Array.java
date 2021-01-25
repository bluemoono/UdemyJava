package ArrayCollections.Desafio;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas notas: ");
		int qtNotas = entrada.nextInt();
		
		double notas[] = new double[qtNotas];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota "+ (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		System.out.println(Arrays.toString(notas));
		
		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		System.out.println("A média é " + (total / notas.length));
		
		entrada.close();
	}
}
