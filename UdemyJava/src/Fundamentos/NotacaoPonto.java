package Fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
//		double a = 3.1;
		
		String s = "Boa noite X";
		s = s.replace("X", "Ana").toUpperCase().concat("!!!");
		
		System.out.println(s);
		
		String x = "Fabio".toUpperCase();
		System.out.println(x);
	}
}
