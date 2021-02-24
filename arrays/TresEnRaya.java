package arrays;

import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un array de Strings de 3*3
		//Pedir por teclado dos posiciones (x,z)
		//Poner en "X"
		//Pintamos el bucle
		
		//creo la matriz
		String x[][]= new String [3][3];
		//la relleno con O
		for(int i=0; i<x.length; i++) {
			for (int j=0; j<x[i].length; j++) {
				x[i][j]="O";
			}
		}
			//pido los 2 índices
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un índice:");
		int n1 = scan.nextInt();
		
		System.out.println("Introduce otro índice");
		int n2 = scan.nextInt();
		
		//pongo la ficha X en la posición indicada
		x[n1][n2] = "X";
		
		//Pinto el tablero
		for (int i= 0; i<x.length; i++) {
			for (int j=0; j<x[i].length; j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
		scan.close();
	}
}