package Encapsulacion;

public class Producto {
	
		//Atributos
		private String codigo;
		private String nombre;
		private double precio;
		
		//Constructor
		public Producto(String codigo, String nombre, double precio) {
			super();
			this.codigo = codigo;
			this.nombre = nombre;
			this.precio = precio;
		}
		
		//Método para aplicar descuento 
		public void aplicarDescuento (double porcentaje) {
			
			//Validación
	        if (porcentaje < 0 || porcentaje > 100) {
	            System.out.println("Descuento inválido para " + nombre);
	            return;
	        }

	        double descuento = precio * (porcentaje / 100);
	        precio -= descuento;
		}
		
		//Método para mostrar la información
		public void mostrar() {
	        System.out.println("Código: " + codigo);
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Precio: Q" + precio);
	        System.out.println("----------------------");
	    }



}
