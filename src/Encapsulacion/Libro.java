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
	
	//Getters y Setters
	public String getTitulo() {return titulo;}
	public void setTitulo(String titulo) {this.titulo = titulo;}

	public String getAutor() {return autor;}
	public void setAutor(String autor) {this.autor = autor;}

	public int getPaginas() {return paginas;}
	public void setPaginas(int paginas) {
		if (paginas > 0) {
			this.paginas = paginas;
		}
	}

	//Método para evaluar si tiene +300 páginas
	public boolean esLargo() {
		return paginas > 300;
	}
	
	//Método para mostrar la información
	public void mostrar() {
		System.out.println("Título: " + titulo + 
						   "\nAutor: " + autor + 
						   "\nPáginas: " + paginas + 
						   "\n----------------------");
		}

}
