package bucles;

public class BuclesEtiquetas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=true;
		
		
		//Bucle principal
principal:			while(b) {
				System.out.println("Estoy en el bucle principal");
					//Bucle hijo
	secundario:				for(int x=0; x<=10; x++) {
						System.out.println("Estoy en el bucle secundario");
						if(x==5) break principal; //El break me lleva al bucle principal otra vez
				}//Una etiqueta permite etiquetar en nuestro programa java
		}

	}

}
