package OrientadoObjeto.Composição.UmPraM;

import java.util.ArrayList;

public class Compra {
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void addItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	double getTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		
		return total; 
	}
}
