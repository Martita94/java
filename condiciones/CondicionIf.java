package condiciones;

import java.util.Scanner;

public class CondicionIf {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * Solo es un comando
		 * if(condicion) comando1;
		 * 
		 * if(condicion)
		 * {
		 * 		s1;
		 * 		s2;
		 * 		s3;
		 * }
		 * if(condicion)
		 * {
		 * 		s1;
		 * 		s2;
		 * 		s3;
		 * }
		 * else
		 * {
		 * 		s1;
		 * 		s2;
		 * }
		 * if (condicion)
		 * {	s1;
		 * 		s2;
		 * 		s3;
		 * }
		 * 	else if(condicion){
		 * 		s1;
		 * 		s2;
		 * 		}
		 * 	else{
		 * 		s1;
		 * 		s2;
		 * }
		 * 
		 */
		//Saber si un numero es par
		int a=10;
		if (a%2==0) {
			System.out.println("Este número es par");
		}else{
			System.out.println("Este número es impar");
		}
		//Pedir una cadena por teclado
		
		System.out.println("Por favor, introduce tu nombre:");
		
        Scanner nombre = new Scanner(System.in);
        String cadena = nombre.nextLine(); //abre una conexión con el teclado
        System.out.println(cadena);

	}

}
