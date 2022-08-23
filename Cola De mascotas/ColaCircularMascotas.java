/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelbuendescanso.Ejercicio2;

/**
 *
 * @author AREA PROGRAMACION
 */
public class ColaCircularMascotas {
    Mascotas c[];
    int frente, fin, max;
    
    public ColaCircularMascotas() {
        frente = 0;
        fin = 0;
        this.max = 10;
        c = new Mascotas[max];
    }
    
    int nroelem ()
    {
	return ((max + fin - frente) % max);
    }


    boolean esvacia ()
    {
	if (frente == fin)
	    return (true);
	return (false);
    }


    boolean esllena ()
    {
	if (nroelem () == max - 1)
	    return (true);
	return (false);
    }


    void adicionar (Mascotas elem)
    {
	if (!esllena ())
	{
	    fin = (fin + 1) % max;
	    c [fin] = elem;
	}
	else
	    System.out.println ("Cola circular llena");
    }


    Mascotas eliminar ()
    {
    	Mascotas elem = new Mascotas ();
	if (!esvacia ())
	{
	    frente = (frente + 1) % max;
	    elem = c [frente];
	    if (nroelem () == 0)
		frente = fin = 0;
	}
	else
	    System.out.println ("Cola circular vacia");
	return (elem);
    }


    void mostrar ()
    {
        int contador = 1;
    	Mascotas elem;
	if (esvacia ())
	    System.out.println ("Cola vacia");
	else
	{
	    ColaCircularMascotas aux = new ColaCircularMascotas();
	    while (!esvacia ())
	    {
		elem = eliminar ();
		aux.adicionar (elem);
		elem.mostrar();
	    }
	    vaciar(aux);
	}
    }


   /* void llenar (int n)
    {
	int i;
	for (i = 1 ; i <= n ; i++)
	{
            Biblioteca elem = new Biblioteca();
	    elem.leer ();
	    adicionar (elem);
	}
    }*/
    //llevar al primer
    void FrenteIncapacidad(){
        Mascotas m = new Mascotas();
        ColaCircularMascotas csi= new  ColaCircularMascotas();
        ColaCircularMascotas cno = new  ColaCircularMascotas();
        while(!esvacia()){
            m = eliminar();
            if(m.getIncapacidad().toLowerCase().equals("si")){
                csi.adicionar(m);
            }else {
                cno.adicionar(m);
            }
        }
        vaciar(csi);
        vaciar(cno);
    }
    void eliminarBeagle(String x){
        Mascotas m = null;
        ColaCircularMascotas caux= new  ColaCircularMascotas();
        while(!esvacia()){
            m = eliminar();
            if (m.getRaza().toLowerCase().equals("beagle")) {
                System.out.println("Can eliminado");
                m.mostrar();
                System.out.println("/********/");
            } else {
                caux.adicionar(m);
            }
        }
        vaciar(caux);
        mostrar();
    }
    
    void llevaalFinal(){
        Mascotas m = null;
        ColaCircularMascotas csi= new  ColaCircularMascotas();
        ColaCircularMascotas cno= new  ColaCircularMascotas();
        while(!esvacia()){
            m = eliminar();
            if(m.getEdad()==1){
                csi.adicionar(m);
            }else {
                cno.adicionar(m);
            }
        }
        vaciar(cno);
        vaciar(csi);
        mostrar();
    }
    void vaciar (ColaCircularMascotas a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }
}
