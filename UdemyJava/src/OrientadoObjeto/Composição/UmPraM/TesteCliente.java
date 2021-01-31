package OrientadoObjeto.Composição.UmPraM;

public class TesteCliente {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "Claudio";
		c1.addItem(new Item("Caneta", 3, 0.3));	
		c1.addItem(new Item("Lapis", 5, 0.2));	
		c1.addItem(new Item("Borracha", 2, 0.5));	
		
		System.out.println(c1.itens.size());
		System.out.println(c1.getTotal());
	}
}
