package condiciones;

import java.util.Scanner;

public class ClausulaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*int x=1;
			switch(x)
			{
			case 0: System.out.println("cero");
					break;
			case 1: System.out.println("uno");
					break;
			case 2: System.out.println("dos");
					break;
			case 3: System.out.println("tres");
					break;
			default:
					System.out.println("ninguno");
			}
	}*/

//Pedimos una letra por teclado, si es aeiou decimos que es vocal y si no decimos consonante
	Scanner numero = new Scanner(System.in);
    String letra; 
    letra =numero.nextLine();
			switch(letra)
			{
			case "a": System.out.println("Letra a");
				break;
			case "e": System.out.println("Letra e");
				break;
			case "i": System.out.println("Letra i");
				break;
			case "o": System.out.println("Letra o");
				break;
			case "u": System.out.println("Letra u");
				break;
			default:
				System.out.println("Es una consonante");
			}numero.close();
			
	}
	
}
			
			
			