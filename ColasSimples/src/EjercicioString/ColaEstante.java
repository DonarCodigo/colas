package EjercicioString;

import java.util.Scanner;

import Ejercicios.ColaSimple;

public class ColaEstante {
	Scanner ls = new Scanner(System.in);
	private Estante c[];
	int frente, fin, max;
	public ColaEstante(int z){
		frente = -1;
		fin = -1;
		max = z;
		c  = new Estante[max];
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
	public void adicola(Estante d){
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
	public Estante elicola(){
		Estante dato = new Estante();
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
	
	public int nroelementos(){
		return fin-frente+1;
	}
	
	public void mostrarColaSimple(){
		ColaEstante caux = new ColaEstante(max);
		Estante x = new Estante();
		System.out.println("los elementos de la cola son: ");
		while(!esvacia()){
			x = elicola();
			x.mostrar();
		}
		vaciar(caux);
	}
	public void vaciar(ColaEstante aux){
		Estante x= new Estante();
		while(!aux.esvacia()){
			x = aux.elicola();
			adicola(x);
		}
	}
}
