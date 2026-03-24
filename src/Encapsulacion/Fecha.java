package Encapsulacion;

public class Fecha {
	
	//Atributos
	private int dia;
	private int mes;
	private int año;
	
	//Constructor
	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	
	//Método para validar la fecha 
	public boolean esValida() {
		
		//Validar dia
		
		if (dia < 1 || dia > 31) {
			return false;
		}
		
		//Validar mes
		if (mes < 1 || mes > 12) {
			return false;
		}
		
		//Validar año
		if (año < 0) {
			return false;
		}
		
		return true; //Si pasa todas las validaciones
	}
	
	//Mostrar información
	public void mostrar() {
		System.out.println(dia + "/" + mes + "/" + año + "\n" + "----------------------" );	
		}

}
