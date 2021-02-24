package bucles;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pedir un número y que haga una cuenta regresiva
		Scanner numero=new Scanner(System.in);
		int n1;
		n1=numero.nextInt();
		
		do {
			System.out.println(n1);
			n1--;
		}while(n1>=0);
		
		numero.close();
		
		/*int x=1;
		do {
			
			System.out.println(x);
			x++;
			
		}while(x<10);*/

	}

}
