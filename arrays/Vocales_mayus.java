package arrays;

import java.util.Scanner;

public class Vocales_mayus {
		
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in) ;
		String frase;
		frase= input.nextLine();
		String fraseMayus = frase.toUpperCase();
		
		for (int i=0; i<frase.length();i++) {
			//Poner la letra en una variable
			char letra = frase.charAt(i);
			
			if(!(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')) {
				System.out.print(letra);
						}
					}
	input.close();
			}
		}
