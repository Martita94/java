package bucles;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numero = new Scanner(System.in);
		int n1;
		n1 = numero.nextInt();
		
		int i = 2; //Si empiezas por 0 no se puede y por 1 siempre se va a poder dividir
		boolean esPrimo = true;
		while (i < n1) {
			if ((n1 % i == 0) && esPrimo == true) {
				esPrimo = false;
			}
			i++;
		}
			if (esPrimo == true) {
				System.out.println("Es primo");
			} else {
				System.out.println("No es primo");
		}
	}

}
