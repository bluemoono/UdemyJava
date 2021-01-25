package ArrayCollections.Exercicio;

import java.util.Arrays;

public class ForEachArray {
	public static void main(String[] args) {
		double alunoA[] = new double[4];
		alunoA[0] = 7.8;
		alunoA[1] = 8.3;
		alunoA[2] = 8.9;
		alunoA[3] = 9.5;
		
		System.out.println(Arrays.toString(alunoA));
		double total =0;
		for (double alunos : alunoA) {
			total += alunos;
		}
		
		System.out.println("Média alunoA: "+ total/alunoA.length);
		
		double alunoB[] = {6.7, 5.7, 6.8, 7.8};
		
		double total2 =0;
		for (double alunob : alunoB) {
			total2 += alunob;
		}
		
		System.out.println("Média alunoB: "+ total2/alunoB.length);
	}
}
