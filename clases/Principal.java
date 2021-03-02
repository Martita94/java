package clases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1= new Persona();//Soy una persona y me identifico como p1. OBJETO 1
		Persona p2= new Persona();//OBJETO 2
		p1.mostrar(); //La clase tiene un método
		System.out.println(p1.saludar("hola")); //Sin el system no la muestra
		p1.setNombre("Marta");//nombre del objeto.property/method
		p2.setNombre("Alberto");
		//Dos objetos distintos porque son instancias de la clase persona
		System.out.println(p1.getNombre() +" "+ p2.getNombre() );
		//LOS ATRIBUTOS JAMÁS DEBEN DE SER ACCEDIDOS DIRECTAMENTE. NO SE PUEDEN TOCAR FUERA DE LA CLASE
		
		//PROBANDO LA CLASE VEHÍCULOS
		Vehículos v1=new Vehículos();
		v1.setRuedas(4);
		System.out.println(v1.getRuedas());
		v1.setCv(100);
		System.out.println(v1.getPotencia());
		v1.setTipo(1);
		v1.setPvp(1000);
		System.out.println(v1.precio());
	}

}
