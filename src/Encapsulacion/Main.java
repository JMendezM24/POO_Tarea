package Encapsulacion;

public class Main {

	public static void main(String[] args) {
		System.out.println("---Iniciando resultados del programa---");
		ejercicioPersona();
		ejercicioRectangulo();
		ejercicioProducto();
		ejercicioCuenta();
		ejercicioLibro();
		ejercicioCalculadora();
		ejercicioFecha();
	}

	//MÉTODO EJERCICIO 1 
	private static void ejercicioPersona() {
		
		System.out.println("\n===== EJERCICIO 1: PERSONA =====");
		
		//Creación de objetos
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

	    //Creación de objetos
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
		
		System.out.println("\n===== EJERCICIO 3: PRODUCTO =====");
		
		//Creación de objetos
		Producto p1 = new Producto("A001", "Laptop", 6000);
		Producto p2 = new Producto("A002", "Impresora", 2500);
		
		//Aplicar descuentos
		p1.aplicarDescuento(25); //25%
		p2.aplicarDescuento(10); //10%
		
		//Mostrar resultados
		p1.mostrar();
		p2.mostrar();

	}
	
	//MÉTODO EJERCICIO 4
	private static void ejercicioCuenta() {
		
		System.out.println("\n===== EJERCICIO 4: CUENTA =====");
		
		//Creación del objeto
	    Cuenta c = new Cuenta("Juan Pérez", 1000);
	    
	    //Operaciones consecutivas 
	    c.depositar(500);   // Operacion 1: ✔ válido
	    c.retirar(300);     // Operacion 2: ✔ válido
	    c.retirar(1500);    // Operacion 3: ❌ fondos insuficientes
	    c.depositar(-50);   // Operacion 4 y final: ❌ inválido

	    //Resultado final
	    c.mostrar();
	}
	
	//MÉTODO EJERCICIO 5
	private static void ejercicioLibro() {
		
		System.out.println("\n===== EJERCICIO 5: LIBRO =====");
		
		//Creación de los objetos
		Libro l1 = new Libro ("A) Game Programming Patterns", "Robert Nystrom", 500);
		Libro l2 = new Libro ("B) Unity in Action", "Joseph Hocking", 250);
		Libro l3 = new Libro ("C) Programming Games with Java", "John Horton", 460);
		
		//Mostrar resultados
		System.out.println("Libro A es largo: " + l1.esLargo());
	    System.out.println("Libro B es largo: " + l2.esLargo());
	    System.out.println("Libro C es largo: " + l3.esLargo());
	}
	
	//MÉTODO EJERCICIO 6
	private static void ejercicioCalculadora() {
		
		 System.out.println("\n===== EJERCICIO 6: CALCULADORA =====");
		
		//Creación del objeto
		Calculadora calc = new Calculadora();

		//Definicón números constantes
	    double a = 25;
	    double b = 35;

	    //Mostrar resultados
	    System.out.println("Suma: " + calc.sumar(a, b));
	    System.out.println("Resta: " + calc.restar(a, b));
	    System.out.println("Multiplicación: " + calc.multiplicar(a, b));
	    System.out.println("División: " + calc.dividir(a, b));

	    //Prueba de error
    	System.out.println("-----------Prueba de error-----------");
	    System.out.println("División entre 0: " + calc.dividir(a, 0));
		
	}
	
	//MÉTODO EJERCICIO 7
	private static void ejercicioFecha() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
