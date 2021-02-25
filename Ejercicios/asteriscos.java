package Ejercicios;

import java.util.Scanner;

public class asteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pintar tantos asteriscos como longitud tenga el nombre
		// alberto --> tu nombre mide 7 --> *******
		
		Scanner input = new Scanner(System.in);
		String nombre;
		nombre = input.nextLine();
		String caracter = input.next(); //pido el caracter por pantalla
		
		//averiguo longitud
		int longitudNombre = nombre.length();
		System.out.println(longitudNombre);
		//Pintar asteriscos
		for(int i=0; i<longitudNombre;i++) {
			System.out.print("*");//Esto es lo que hace que muestre los asteriscos
			System.out.print(caracter);
		}input.close();
	}
}
