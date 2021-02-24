package arrays;

import java.util.Scanner;

public class ClaseArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] array1 = new int [10];
		String[] frases= new String[3]; //Un array de cadenas que va a tener 5 cadenas
		
		//Pedir por teclado tres nombres, meterlo en array frases y luego los visualizamos
		Scanner entrada= new Scanner (System.in);
		//Pedir las tres frases por teclado
		for (int posicion=0; posicion<=2; posicion++) {
			frases [posicion] = entrada.nextLine();
		}
		//Imprimir las frases
		for (int posicion=0; posicion<=2; posicion++) {
			System.out.println(frases[posicion]);
		}
		entrada.close();
	}
}
