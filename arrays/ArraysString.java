package arrays;

import java.util.Scanner;

public class ArraysString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "hola";
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Introduce la primera palabra: ");
        String frase = scan.nextLine();

        for (int i = frase.length() - 1 ; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }

        scan.close();

    }
		}
	


