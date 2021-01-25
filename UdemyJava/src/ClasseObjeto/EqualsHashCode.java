package ClasseObjeto;

public class EqualsHashCode {
	String nome;
	String email;
	
	public boolean equals(Object obj) {
		
		if(obj instanceof EqualsHashCode) {			
			EqualsHashCode outro = (EqualsHashCode) obj;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
			
		} else {
			return false;
		}
		
		//hashcode será feito em outra aula.
	}
	
	public static void main(String[] args) {
		EqualsHashCode u1 = new EqualsHashCode();
		u1.nome = "Pedro silva";
		u1.email = "pedro.silva@p.s";
		
		EqualsHashCode u2 = new EqualsHashCode();
		u2.nome = "Pedro silva";
		u2.email = "pedro.silva@p.s";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
	}
}
