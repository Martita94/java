package variablesYoperadores;

public class Variables1 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		boolean v=true;
		char letra='x';
		double dl=3.10;
		long l1=189909;
		int i=10; //32bit
		short s=200; //16bit
		float f=2.4f;
		byte b=100; 
		
		String nombre="Marta";
		String apellido="Campillo";
		long salario=2000;
		int irpf=10;
		long impuesto=salario/irpf;
		
		System.out.println("Me llamo " +nombre+" "+apellido +" gano "+salario+" y tengo un irpf de "+impuesto);
		
	}

}
