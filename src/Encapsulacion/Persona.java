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
	
	//Getters y Setters
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public String getApellido() {return apellido;}
	public void setApellido(String apellido) {this.apellido = apellido;}

	public int getEdad() {return edad;}
	public void setEdad(int edad) {this.edad = edad;}

	//Método para mostrar los datos
	public void mostrar() {
		System.out.println("Nombre: " + nombre + 
						   "\nApellido: " + apellido + 
						   "\nEdad: " + edad + 
						   "\n------------------------");
	}
}