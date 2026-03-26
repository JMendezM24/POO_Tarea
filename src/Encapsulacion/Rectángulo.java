package Encapsulacion;

public class Rectángulo {

	//Atributos de la clase
	private double base;
	private double altura;
	
	//Constructor
	public Rectángulo(double altura, double base) {
		super();
		this.altura = altura;
		this.base = base;
	}
	
	//Getters y Setters
	public double getBase() {return base;}
	public void setBase(double base) {this.base = base;}

	public double getAltura() {return altura;}
	public void setAltura(double altura) {this.altura = altura;}
	
	//Método para calcular el  área
	public double area() {
		return base * altura;
	}
	
	//Método para calcular el perimetro 
	public double perimetro() {
		return 2 * (base + altura);
	}
	
	//Método para mostrar toda la información
    public void mostrar() {
        System.out.println("Base: " + base + 
        				   "\nAltura: " + altura +
        				   "\nÁrea: " + area() +
        				   "\nPerímetro: " + perimetro() +
        				   "\n----------------------");
    }
}