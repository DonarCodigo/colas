package EjercicioString;

public class main {

	public static void main(String[] args) {
		PilaLibro p1 = new PilaLibro();
		Libro li1 = new Libro("jorge", "estructura1 datos", 100, "altamar", 3, "informatica");
		Libro li3 = new Libro("abad", "Estructura2 datos", 100, "rmx", 3, "informatica");
		Libro li2 = new Libro("jorge", "Estructura3 datos", 100, "francis", 3, "informatica");
		Libro li4 = new Libro("vladimin", "Estructura4 datos", 100, "el pizarron", 3, "informatica");
		Libro li5 = new Libro("estefani", "Estructura5 datos", 100, "gozustyle", 3, "informatica");
		p1.adipila(li1);
		p1.adipila(li2);
		p1.adipila(li3);
		p1.adipila(li4);
		p1.adipila(li5);
		
		PilaLibro p2 = new PilaLibro();
		Libro li6 = new Libro("juan", "estructura de datos1", 150, "andres", 4, "matematica");
		Libro li7 = new Libro("juan", "estructura de datos 2", 150, "andres", 4, "matematica");
		Libro li8 = new Libro("juan", "estructura de datos 3", 150, "andres", 4, "matematica");
		Libro li9 = new Libro("juan", "estructura de datos 4", 150, "andres", 4, "matematica");
		Libro li10 = new Libro("juan", "estructura de datos 5", 150, "andres", 4, "matematica");
		p2.adipila(li6);
		p2.adipila(li7);
		p2.adipila(li8);
		p2.adipila(li9);
		p2.adipila(li10);
		
		Estante e = new Estante(1, "estante informatica", p1);
		Estante e2 = new Estante(2, "Estante mateamtica", p2);
		
		
		ColaEstante ce = new ColaEstante(2);
		ce.adicola(e);
		ce.adicola(e2);
		ce.mostrarColaSimple();
		
	}

}
