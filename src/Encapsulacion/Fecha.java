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
		return (dia >= 1 && dia <=31)
			&& (mes >= 1 && mes <=12)
			&& (año > 0);
	}
	
	//Mostrar información
	public void mostrar() {
		System.out.println(dia + "/" + mes + "/" + año + 
						   "\n----------------------" );	
		}

}
