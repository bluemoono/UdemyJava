package ClasseObjeto;

public class Produto {
	String nome;
	double preco;
	double descontoAdcional;
	final static double DESCONTO = 0.25;
	
	Produto(){
		
	}
	
	Produto(String nomeIncial){
		nome = nomeIncial;
	}
	
	Produto(String nomeIncial, double precoInicial){
		nome = nomeIncial;
		preco = precoInicial;
	}
	
	double precoComDescconto() {
		return preco * (1 - DESCONTO);
	}
	
	double precoComDescconto(double descontoDoGerente) {
		return preco * (1 - DESCONTO + descontoDoGerente);
	}
	
	public static void main(String[] args) {
		Produto p1 = new Produto("Caneta");
		//p1.nome = "Caneta";
		p1.preco = 1.5;
		//p1.desconto = 0.1;
		
		Produto p2 = new Produto("Lápis");
		//p2.nome = "Lápis";
		p2.preco = 0.5;
		//p2.desconto = 0.05;
		
		System.out.println(p1.nome+ " "+ p1.precoComDescconto());
		System.out.println(p2.nome+ " "+ p2.precoComDescconto());
		
		double precoDesconto1 = p1.precoComDescconto();
		double precoDesconto2 = p2.precoComDescconto();
		double carrinho = (precoDesconto1 + precoDesconto2)/2;

		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		System.out.println(precoDesconto1);
		System.out.println(precoDesconto2);
		System.out.printf("Media carrinho: %.2f", carrinho);
	}
}
