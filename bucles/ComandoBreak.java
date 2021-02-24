package bucles;

import java.util.Scanner;

public class ComandoBreak {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		int n1;
		int n2;
		n1 = numero.nextInt();
		n2 = numero.nextInt();
		while (n1 <= n2) {
			System.out.println(n1);
			n1++;
			//if (n1==12) break; //lo uso para hacer una salida abrupta
		}
		System.out.println("Te has salido con un valor:"+n1);
	}
}
