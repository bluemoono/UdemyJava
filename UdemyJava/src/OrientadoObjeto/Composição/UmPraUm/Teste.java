package OrientadoObjeto.Composição.UmPraUm;

public class Teste {
	public static void main(String[] args) {
		Carro c1 = null;
		Motor m1 = new Motor(c1);
		c1 = new Carro(m1);
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.motor.giros());
				
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println(c1.motor.giros());
	}
}
