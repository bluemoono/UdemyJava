package Fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// informações de um funcionario
		
		//interios
		byte anosEmpresa = 6;
		short voos = 782;
		int id = 80923;
		long pontosAcumulados = 3_534_990_423L;
		
		//flutuantes
		float salario = 11_983.45F;
		double vendas = 2_984_965_452.54;
		
		//outros
		boolean ferias = false;
		char sexo = 'M';
		
		//dias da empresa
		System.out.println(anosEmpresa * 365);
		//n de viajens
		System.out.println(voos/2);
		//postos por real
		System.out.println(pontosAcumulados/vendas);
		//funcionario
		System.out.println("O funcionario "+id+" ganha o R$ "+salario);
		System.out.println("Sexo: "+sexo);
		System.out.println("Férias: "+ferias);
	}
}
