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

	        //Validación importante
	        if (b == 0) {
	            System.out.println("Error: división entre cero");
	            return 0;
	        }

	        return a / b;
	    }
}
