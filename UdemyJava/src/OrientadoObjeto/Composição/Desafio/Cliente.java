package OrientadoObjeto.Composição.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome = "";
	List<Compra> compra = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	double Total() {
		double total = 0;
		 for(Compra compras: compra) {
			 total += compras.Total();
		 }
		 
		 return total;
	}
}
