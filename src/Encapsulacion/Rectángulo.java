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
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area());          
        System.out.println("Perímetro: " + perimetro());
        System.out.println("----------------------");
    }


}
