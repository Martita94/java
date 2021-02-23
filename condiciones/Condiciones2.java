package condiciones;

import java.util.Scanner;

public class Condiciones2 {

	public static void main(String[] args) {
		
		System.out.println("Escriba un número: ");
		System.out.println("Escriba otro número: ");
		System.out.println("Escriba otro número: ");
		
		Scanner numero=new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		n1=numero.nextInt();
		n2=numero.nextInt();
		n3=numero.nextInt();
		//System.out.println(n1);
		//System.out.println(n2);
		
		//Pide dos números y pinta el mayor
		/*if (n1>n2) {
			System.out.println(n1);
		}else {
			System.out.println(n2);
		numero.close(); 
		}*/
		
		if ((n1>n2) && (n1>n3)) {
			System.out.println(n1);
		}else if ((n2>n3) && (n2>n1)){
			System.out.println(n2);
		}else if ((n3>n1) && (n3>n2)) {
			System.out.println(n3);
		}
		numero.close();
	}

}
