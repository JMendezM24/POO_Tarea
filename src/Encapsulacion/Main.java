package Encapsulacion;

public class Main {

	public static void main(String[] args) {
		System.out.println("---Iniciando programa---");
		ejercicioPersona();
		ejercicioRectangulo();
		ejercicioProducto();
	}

	//MÉTODO EJERCICIO 1 
	private static void ejercicioPersona() {
		
		System.out.println("\n===== EJERCICIO 1: PERSONA =====");
		
		//Crear objetos
        Persona p1 = new Persona("Lara", "Croft", 29);
        Persona p2 = new Persona("John", "Espartan", 35);
        Persona p3 = new Persona("Leon", "Kennedy", 30);
        
        //Mostrar resultados
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
	}
	
	
	//MÉTODO EJERCICIO 2
	private static void ejercicioRectangulo() {
		
		System.out.println("\n===== EJERCICIO 2: RECTÁNGULO =====");

	    //Crear objetos
	    Rectángulo r1 = new Rectángulo(5, 10);
	    Rectángulo r2 = new Rectángulo(7, 6);

	    //Mostrar información completa
	    System.out.println("===Rectángulo 1===");
	    r1.mostrar();
	    System.out.println("===Rectángulo 2===");
	    r2.mostrar();

	    //Comparación de áreas
	    if (r1.area() > r2.area()) {
	        System.out.println("El Rectángulo 1 tiene mayor área");
	    } else if (r2.area() > r1.area()) {
	        System.out.println("El Rectángulo 2 tiene mayor área");
	    } else {
	        System.out.println("Ambos tienen la misma área");
	    }
	}
	
	
	//MÉTODO EJERCICIO 3
	private static void ejercicioProducto() {
		
	}
	
}
