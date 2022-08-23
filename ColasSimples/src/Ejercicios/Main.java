package Ejercicios;

public class Main {

	public static void main(String[] args) {
		ColaSimple cs = new ColaSimple(5);
		cs.adicola(3);
		cs.adicola(15);
		cs.adicola(1);
		cs.adicola(5);
		cs.adicola(20);
		cs.mostrarColaSimple();
		System.out.println("********************");
		ordenarCola(cs);
		cs.mostrarColaSimple();
	}
	public static void ordenarCola(ColaSimple cs){
		int may = 0, x = 0;
		ColaSimple ca1 = new ColaSimple(cs.max);
		ColaSimple ca2 = new ColaSimple(cs.max);
		for (int i = 0; i < cs.max; i++) {
			while(!cs.esvacia()){
				x = cs.elicola();
				if(x > may){
					may = x;
				}
				ca1.adicola(x);
			}
			while(!ca1.esvacia()){
				x = ca1.elicola();
				if(x == may){
					ca2.adicola(x);
				}else{
					cs.adicola(x);
				}
			}
			may = 0;
		}
		cs.vaciar(ca2);
	}
}
