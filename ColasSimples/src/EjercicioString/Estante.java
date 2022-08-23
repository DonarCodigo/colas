package EjercicioString;

public class Estante {
	int nro;
	String nombre;
	PilaLibro pli;
	public Estante(){
		this.nro = 0;
		this.nombre = " ";
		pli = null;
	}
	public Estante(int nro, String nombre, PilaLibro pli) {
		super();
		this.nro = nro;
		this.nombre = nombre;
		this.pli = pli;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public PilaLibro getPli() {
		return pli;
	}
	public void setPli(PilaLibro pli) {
		this.pli = pli;
	}
	
	public void mostrar(){
		System.out.println(getNombre());
		System.out.println(getNro());
		pli.mostrar();
		
	}
	
}
