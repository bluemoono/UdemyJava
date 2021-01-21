package Fundamentos;

public class ConversaoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 5;//implicita
		System.out.println(a);
		
		float b = (float) 1.0; //explicita (CAST)
		System.out.println(b);
		
		int c = 9;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 65;
		int f = (int) e;
		System.out.println(f);
	}
}
