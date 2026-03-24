package Encapsulacion;

public class Persona {
	
	//Atributos de la clase
	private String nombre;
	private String apellido;
	private int edad;
	
	//Constructor
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	//Método para mostrar los datos
	public void mostrar() {
		System.out.println("Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Edad: " + edad + "\n" + "------------------------");
	}
}
