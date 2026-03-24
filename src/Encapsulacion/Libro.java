package Encapsulacion;

public class Libro {
	
	//Atributos 
	private String titulo;
	private String autor;
	private int paginas;
	
	//Constructor
	public Libro(String titulo, String autor, int paginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	
	//Método para evaluar si tiene +300 páginas
	public boolean esLargo() {
		return paginas > 300; //retornar true o false directamente  
	}
	
	//Método para mostrar la información
	public void mostrar() {
		System.out.println("Título: " + titulo + "\n" + "Autor: " + autor + "\n" + "Páginas: " + paginas + "\n" + "----------------------");
		}

}
