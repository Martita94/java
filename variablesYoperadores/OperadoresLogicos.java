package variablesYoperadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		/*
		 * == != <= >= < >
		 * 
		 * 
		 */
		
		int z=10;
		int r=9;
		System.out.println(z>r);
		
		/*
		 * && --> AND
		 * || --> OR
		 * !  --> NOT
		 */
		int x=90;
		System.out.println(z<r||x>r);
		System.out.println(z<r && x>r);
		System.out.println(   !(z<r && x>r)  );
		String cadena= z<r?"Si":"No"; 
		//Operador ternario: Una condición si se cumple devuelve lo que está detrás de la ? y si no
		//devuelve lo que está detrás de los puntos
		System.out.println(cadena);
		String cadena2= x%2==0?"Par":"Impar";
		System.out.println(cadena2);
		
		//Comprobar si un numero es par o impar
		int num1=10;
		int num2=2;
		System.out.println(num1%num2==0?"Par":"Impar");

	}

}
