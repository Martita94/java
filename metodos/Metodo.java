package metodos;

public class Metodo {
	//Primer método
	public static void main(String[] args) {
		int x=m1();
		System.out.println(x);
		m2();
		String y=nombre(); //no hace falta que lo meta en una variable
		System.out.println(y);
		System.out.println(nombre());
		System.out.println(sumar(10,20));
		System.out.println(inicial("Ejemplo"));
		String dato="prueba";
		System.out.println(inicial(dato));
		System.out.println(iniciales("Marta", "Campillo", "Gállego"));
		System.out.println(primos(4));
	}
	//Segundo método
	public static int m1() {
		
		return 1;
	}
	
	//Procedimientos: ejecuta pero no devuelve nada
	public static void m2() {
		System.out.println("estoy en un método void");
	}
	
	public static String nombre() {
		return "Marta Campillo";
	}
	
	public static int sumar (int num1, int num2) {
		return num1+num2;
	}
	//Pasamos una cadena y nos devuelve la primera letra en mayúsculas
	public static char inicial(String cadena) {
		String mayus = cadena.toUpperCase();
		return mayus.charAt(0); //nos devuelve la primera letra
	}

	//iniciales 3 argumentos: nombres y dos apellidos
	//devolver iniciales
	
	public static String iniciales(String n, String ap1, String ap2) {
		return n.toUpperCase().charAt(0) + ". " + ap1.toUpperCase().charAt(0) + ". " + ap2.toUpperCase().charAt(0);
	}


	public static String primos(int n1) {
		
		int i = 2; 
		boolean esPrimo = true;
		while (i < n1) {
			if ((n1 % i == 0) && esPrimo == true) {
				esPrimo = false;
			}
			i++;
		}
			if (esPrimo == true) {
				return("Es primo");
			} else {
				return("No es primo");
		}
	}
	

}




