package clases;

public class Persona {//Una clase es una declaración de un objeto.
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre; //El this hace referencia a la propia clase, lo pongo para evitar errores o confusión entre variable y propiedad
	}
	public long getSalario() {
		return salario;
	}
	public void setSalario(long salario) {
		this.salario = salario;
	//public void setSalario(long s){     Si quitamos el this se puede poner así
		//salario=s;
	}

	//Propiedades (variables)
	private String nombre;
	private long salario;
	//LOS ATRIBUTOS JAMÁS DEBEN DE SER ACCEDIDOS DIRECTAMENTE. NORMALMENTE LOS ATRIBUTOS SON PRIVADOS.
	
	//Métodos setters y getters: se encargan de poner y leer valores de las propiedades.
	
//Métodos
	
	public void mostrar () 
	{
		System.out.println("Estoy en una instancia de la clase Persona");
	}
	//UN MÉTODO PRIVADO SOLO PUEDE SER INVOCADO DESDE LA PROPIA CLASE 
	private void metodo_privado() 
	{
		System.out.println("Estoy en un método privado");
	}

	public String saludar(String nombre) {
		return nombre;
	}
}
