package Encapsulacion;

public class Calculadora {

	    //Suma
	    public double sumar(double a, double b) {
	        return a + b;
	    }

	    //Resta
	    public double restar(double a, double b) {
	        return a - b;
	    }

	    //Multiplicación
	    public double multiplicar(double a, double b) {
	        return a * b;
	    }

	    //División
	    public double dividir(double a, double b) {
	        if (b != 0) {
		        return a / b;
	        }else {
	            System.out.println("Error: No se puede dividir entre cero");
	            return 0;
	        }	
	    }

}