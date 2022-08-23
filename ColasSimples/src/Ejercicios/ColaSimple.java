package Ejercicios;
import java.util.*;
public class ColaSimple {
	Scanner ls = new Scanner(System.in);
	private int c [];
	int frente, fin, max;
	public ColaSimple(int z){
		frente = -1;
		fin = -1;
		max = z;
		c  = new int[max];
	}
	public boolean esvacia(){
		if(frente == -1)
			return true;
		else
			return false;		
	}
	
	public boolean esllena(){
		if(fin == max-1)
			return true;
		else
			return false;
	}
	public void adicola(int d){
		if(esllena()){
			System.out.println("cola llena");
		}else{
			fin = fin+1;
			c[fin] = d;
			if(fin == 0){
				frente = 0;
			}
		}
	}
	public int elicola(){
		int dato = 0;
		if(esvacia())
		{System.out.println("cola vacia");}
		else {
			dato = c[frente];
			if(fin == frente){
				frente = -1;
				fin = -1;
			}
			else {
				frente = frente+1;
			}
		}
		return (dato);
	}
	public void llenar(int n){
		int c;
		int x;
		System.out.println("escriba los elementos: ");
		
		for (int i = 1; i < n; i++) {
			x = ls.nextInt();
			adicola(x);
		}
	}
	public int nroelementos(){
		return fin-frente+1;
	}
	public void mostrarColaSimple(){
		ColaSimple caux = new ColaSimple(max);
		int x;
		System.out.println("los elementos de la cola son: ");
		while(!esvacia()){
			x = elicola();
			System.out.println(" "+x);
			caux.adicola(x);
		}
		vaciar(caux);
	}
	public void vaciar(ColaSimple aux){
		int x;
		while(!aux.esvacia()){
			x = aux.elicola();
			adicola(x);
		}
	}
}













