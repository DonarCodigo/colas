package EjercicioString;

public class Libro {
	String autor;
	String titulo;
	int nroPag;
	String editorial;
	int edicion;
	String area;
	public Libro(String autor, String titulo, int nroPag, String editorial,
			int edicion, String area) {
		this.autor = autor;
		this.titulo = titulo;
		this.nroPag = nroPag;
		this.editorial = editorial;
		this.edicion = edicion;
		this.area = area;
	}
	public Libro(){
		autor = " ";
		area=" ";
		titulo = " ";
		nroPag  = 0;
		editorial = " ";
		edicion = 0;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNroPag() {
		return nroPag;
	}
	public void setNroPag(int nroPag) {
		this.nroPag = nroPag;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getEdicion() {
		return edicion;
	}
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void mostrar() {
		System.out.println("Libro [autor=" + autor + ", titulo=" + titulo + ", nroPag="
				+ nroPag + ", editorial=" + editorial + ", edicion=" + edicion
				+ ", area=" + area + "]"); 
	}
	
}
