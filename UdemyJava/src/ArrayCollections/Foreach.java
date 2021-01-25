package ArrayCollections;

public class Foreach {
	public static void main(String[] args) {
		double notas[] = {9.9, 6.7, 9.7 ,6.7 };
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		System.out.println();
		
		for (double nota : notas) {
			System.out.println(nota);
		}
	}
}
