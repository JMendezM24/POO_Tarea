package Encapsulacion;

public class Producto {

    //Atributos
    private String codigo;
    private String nombre;
    private double precio;               
    
    //Constructor
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //Getters y Setters
    public String getCodigo() {return codigo;}
	public void setCodigo(String codigo) {this.codigo = codigo;}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public double getPrecio() {return precio;}
	public void setPrecio(double precio) {
		if (precio >= 0) {
			this.precio = precio;
		}
	}

    //Aplicar descuento
    public void aplicarDescuento(double porcentaje) {
    	precio -= precio * (porcentaje / 100);
    }
    
    //Metodo para mostrar informacion
    public void mostrar() {
    	System.out.println("Código: " + codigo +
    					   "\nProducto: " + nombre +
    					   "\nPrecio: Q." + precio);
    }
}