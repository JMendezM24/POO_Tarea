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
        
    /*  System.out.println("---Datos iniciales de P1---");
        p1.mostrar();
        
        //SETTERS DE PRUEBA
        p1.setNombre("Laura");
        p1.setApellido("Sandoval");
        p1.setEdad(25);
        
        System.out.println("---Datos modificados de P1---");
   */
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
		
		//Informacion de Producto 1
		System.out.println("---Producto 1---");
		p1.mostrar();
		
		p1.aplicarDescuento(25); //25%
		
	    System.out.println("Precio con descuento (25%): Q." + p1.getPrecio() +
	    				   "\n----------------------");
	    
		//Informacion de Producto 2
		System.out.println("---Producto 2---");
		p2.mostrar();	
		
		p2.aplicarDescuento(10); //10%
		
	    System.out.println("Precio con descuento (10%): Q." + p2.getPrecio() +
	    				   "\n----------------------");

	}
	
	//MÉTODO EJERCICIO 4
	private static void ejercicioCuenta() {
		
		System.out.println("\n===== EJERCICIO 4: CUENTA =====");
		
		//Creación del objeto
	    Cuenta c = new Cuenta("Juan Pérez", 1000);
	    
	    //Mostrar datos iniciales
	    c.mostrar();
	    
	    //Operaciones de prueba 
	    c.depositar(500);   // Operacion 1: ✔ válido
	    c.retirar(300);     // Operacion 2: ✔ válido
	    c.retirar(1500);    // Operacion 3: ❌ fondos insuficientes
	    c.depositar(-500);  // Operacion 4: ❌ inválido
	    c.retirar(-300); 	// Operacion 5: ❌ inválido
	    
	    //Saldo final usando Get
	    System.out.println("Saldo final: Q." + c.getSaldo());
	}
	
	//MÉTODO EJERCICIO 5
	private static void ejercicioLibro() {
		
		System.out.println("\n===== EJERCICIO 5: LIBRO =====");
		
		//Creación de los objetos
		Libro l1 = new Libro ("Game Programming Patterns", "Robert Nystrom", 500);
		Libro l2 = new Libro ("Unity in Action", "Joseph Hocking", 250);
		Libro l3 = new Libro ("Programming Games with Java", "John Horton", 460);
		
		//Mostrar informacion de los libros
		System.out.println("--Libro A--");
		l1.mostrar();
		System.out.println("--Libro B--");
		l2.mostrar();
		System.out.println("--Libro C--");
		l3.mostrar();
		
		//Mostrar resultados con get y set
		if (l1.esLargo()) {
            System.out.println("El libro A es largo. Con: " + l1.getPaginas() + " pag.");
        }

        if (l2.esLargo()) {
            System.out.println("El libro B es largo. Con: " + l2.getPaginas() + " pag");
        }

        if (l3.esLargo()) {
            System.out.println("El libro C es largo. Con: " + l3.getPaginas() + " pag.");
        }
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
		
		 System.out.println("\n===== EJERCICIO 7: FECHA =====");
		 
		 //Creación de los objetos
		 Fecha f1 = new Fecha(27, 3, 2026);
		 Fecha f2 = new Fecha(32, 1, 2026);
		 Fecha f3 = new Fecha(10, 15, 2026);
		 
		 //Imprimir las fechas 
		 System.out.println("---Fecha 1---");
		 f1.mostrar();
		 System.out.println("---Fecha 2---");
		 f2.mostrar();
		 System.out.println("---Fecha 3---");
		 f3.mostrar();
		  
		 //Mostrar resultados
		 System.out.println("¿Fecha 1 válida?: " + f1.esValida());
		 System.out.println("¿Fecha 2 válida?: " + f2.esValida());
		 System.out.println("¿Fecha 3 válida?: " + f3.esValida());
	}		
}