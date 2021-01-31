package OrientadoObjeto.Composição.Desafio;

public class Teste {
	public static void main(String[] args) {
		//Cliente c = new Cliente("MAria Aberlina");
		
		Compra c1 = new Compra();
		c1.addItem("Caneta", 0.4, 3);
		c1.addItem(new Produto("Notebook", 1893), 1);
		
		Cliente c2 = new Cliente("Fabio Assis");
		c2.compra.add(c1);
		
		System.out.println(c2.Total());
		
	}
}
