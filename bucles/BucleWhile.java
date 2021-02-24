package bucles;

import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		while(x<=10) {
			System.out.println(x);
			x++;
	//Pedir dos números por teclado y visualizar todos los números entre ellos
			
		Scanner numero=new Scanner(System.in);
		int n1;
		int n2;
		n1=numero.nextInt();
		n2=numero.nextInt();
		while (n1<=n2){
			System.out.println(n1);
			n1++;
		}numero.close();
	}

	}

}
