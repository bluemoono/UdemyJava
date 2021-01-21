package Controle;


public class Break {
	public static void main(String[] args) {
		for (int i = 0; i<10;i++) {
			if(i ==5) {
				break;
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim\n\n\n");
		
		
		externo: for (int j = 0; j<3;j++) {
			for (int i = 0; i<3;i++) {
				if(i == 1) {
					break externo;
				}
				
				System.out.printf("%d %d", i, j);
			}
			
			System.out.println();
		}
		
		System.out.println("fim");
	}
}
