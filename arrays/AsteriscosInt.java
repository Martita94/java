package arrays;

import java.lang.reflect.Array;

public class AsteriscosInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array de enteros de 10
		//Lo rellenamos con números del 1 al 10 aleatorios Math.random() *10 +1
		//por cada número pintamos el mismo número de asteriscos
		// array de 2,3,4 
		//2 **
		//3 ***
		
		//Crear el array
		int [] array1 = new int [10];
		
		//Rellenarlo con números aleatorios
		for (int i=0; i<array1.length; i++) 
		{//Hay que hacer un casting porque random devuelve un double
			array1[i] = (int) (Math.random() * 10 + 1); 	
		}
		
		//Por cada número del array...
		for (int i=0; i<array1.length; i++) 
		{
			System.out.print("Número:"+array1[i]+"->");
			//Pinto asteriscos
			
			for (int asteriscos=0; asteriscos <array1[i]; asteriscos++) {
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
