package ClasseObjeto.Desafio;

public class Data {
	public int dia;
	public int mes;
	public int ano;
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String impressao() {
		final String formato = "Data: %d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}
	
	public static void main(String[] args) {
		Data d1 = new Data(5, 12, 1893);
		Data d2 = new Data();
		
		String dtFormatada1 = d1.impressao();
		
		System.out.println(d2.impressao());
		System.out.println(dtFormatada1);
		
		System.out.printf("Data: %d/%d/%d", d1.dia, d1.mes, d1.ano);
	}
}
