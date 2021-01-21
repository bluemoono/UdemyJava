package Controle;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i<10;i++) {
			if(i % 2 == 1) {
				continue;
			}
			
			System.out.println(i + "\n\n\n");
		}
		
		externo: for (int j = 0; j<3;j++) {
			for (int i = 0; i<3;i++) {
				if(i == 1) {
					break externo;
				}
				
				System.out.printf("%d %d", i, j);
			}
			
			System.out.println("Fim");
		}
	}
}
