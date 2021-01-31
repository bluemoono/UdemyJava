package OrientadoObjeto.Polimorfismo;

public class Refeicao {
	public static void main(String[] args) {
		Pessoa p = new Pessoa(85.6);
		Janta j = new Janta(0.3);
		Salada s = new Salada(0.5);
		Sorvete sv = new Sorvete(0.2);
		
		System.out.println(p.getPeso());
		
		p.comer(j);
		p.comer(s);
		System.out.println(p.getPeso());
		
		p.comer(sv);
		System.out.println(p.getPeso());
		
	}
}
