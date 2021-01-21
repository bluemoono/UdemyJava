package ClasseObjeto;


public class AreaCirc {
	double raio;
	final static double PI = 3.14;
	
	AreaCirc(double raioI){
		raio = raioI;
	}
	
	double area() {
		return PI * raio * raio;
	}
	
	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(10);
		System.out.println(a1.area());
		
		AreaCirc a2 = new AreaCirc(42);
		System.out.println(a2.area());
		
		//AreaCirc.PI = 8;
		System.out.println(a1.area());
		System.out.println(a2.area());
		System.out.println(AreaCirc.PI);
	}
}
