package variablesYoperadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// * / +  resto %  ++ --
		
		int n1=100;
		System.out.println(n1%2);
		
		//++  n=n+1
		int n2=10;
		System.out.println(++n2); 
		System.out.println(n2++);
		//Si pones ++ a la drch hace primero hace el print y luego la operación 
		//si lo pones el ++ a la izda hace la suma y después lo imprime
		
		//+= *=
		int v2=5;
		System.out.println(v2*=4); //v2=v2*4

	}

}
