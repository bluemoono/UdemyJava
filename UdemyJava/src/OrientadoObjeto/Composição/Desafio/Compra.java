package OrientadoObjeto.Composição.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	List<Item> itens = new ArrayList<>();
	
	void addItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}
	
	void addItem(String nome, double preco, int qtde) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}
	
	double Total() {
		double total = 0;
		
		for(Item itens: this.itens) {
			total += itens.qtde * itens.produto.preco;
		}
		
		return total;
	}
}
