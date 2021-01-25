package ArrayCollections;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		double notasAlunoA[] = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 6.43;
		notasAlunoA[1] = 9.76;
		notasAlunoA[2] = 7.75;
		notasAlunoA[3] = 7.75;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println("Média: " + total/notasAlunoA.length);
		
		double notasAlunoB[] = {6.7, 5.7, 6.8, 7.8};
		
		double totalB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
		}
		
		System.out.println(totalB / notasAlunoB.length);
	}
}
