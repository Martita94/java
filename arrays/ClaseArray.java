package arrays;

public class ClaseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dos opciones para crear un array
		//Primera: estilo C++
		
		//int array1[];
		
		//Estilo Java:
		//int[] array2;
		
		/*int[] array3= {20,30,40,57,21};
		
		int longitud=array3.length - 1;
		int i=0;
		
		while (i<=longitud) {
			System.out.println(array3[i]);
			i++;
		}*/
		 //Mostrar el array normal y al revés
		int[] array3= {20,30,40,34,37};
	      
	      System.out.println("Recorro el bucle");
	      
	      for(int contador=0;contador<=4;contador++)
	      {
	    	  System.out.print(array3[contador]+"-");
	      }
	      System.out.println("\nRecorro el bucle al reves");
	      for(int contador=4;contador>=0;contador--)
	      {
	    	  System.out.print(array3[contador]+"-");
	      }

		}
	}


