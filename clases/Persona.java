package clases;

public class Persona {
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getSalario() {
		return salario;
	}
	public void setSalario(long salario) {
		this.salario = salario;
	}

	//Propiedades (variables)
	private String nombre;
	private long salario;
	//LOS ATRIBUTOS JAMÁS DEBEN DE SER ACCEDIDOS DIRECTAMENTE. NORMALMENTE LAS PROPIEDADES SON PRIVADAS.
	//Métodos setters y getters: se encargan de poner y leer valores de los atributos.
	
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
