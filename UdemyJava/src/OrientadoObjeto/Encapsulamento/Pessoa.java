package OrientadoObjeto.Encapsulamento;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(int idade, String nome) {
		setIdade(idade);
		setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >=0 && novaIdade <=120) {
			this.idade = novaIdade;
		}
	}
	
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(5, "Afonso");
		p1.getIdade();
//		p1.idade = -4; //alterar o valor
		
		System.out.println(p1.idade); //ler o valor
	}
}
