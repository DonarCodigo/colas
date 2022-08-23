/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colasv;

/**
 *
 * @author Carmen Huanca
 */
public class CCircularP {
    private int max=150;
    private Provincia v[]=new Provincia[max+1];
    private int ini,fin;
    CCircularP()
    {
        ini=fin=0;
    }
    int nroelem ()
    {
	return ((max + fin - ini) % max);
    }
    boolean esvacia ()
    {
	if (nroelem () == 0)
	    return (true);
	return (false);
    }
    boolean esllena ()
    {
	if (nroelem () == max - 1)
	    return (true);
	return (false);
    }
    void adicionar (Provincia elem)
    {
	if (!esllena ())
	{

	    fin = (fin + 1) % max;
	    v [fin] = elem;
	}
	else
	    System.out.println ("Cola circular llena");
    }
    Provincia eliminar ()
    {
	Provincia elem = null;
	if (!esvacia ())
	{
	    ini = (ini + 1) % max;
	    elem = v [ini];
	    if (nroelem () == 0)
		ini = fin = 0;
	}
	else
	    System.out.println ("Cola circular vacia");
	return (elem);
    }
    void mostrar ()
    {
	if (esvacia ())
	    System.out.println ("Cola vacia xxx");
	else
	{
	    System.out.println ("\n Provincias de la Cola ");
	    CCircularP aux = new CCircularP ();
	    while (!esvacia ())
	    {
		Provincia elem = eliminar ();
		aux.adicionar (elem);
		elem.mostrar();
	    }
	    vaciar(aux);
	}
    }
    void vaciar (CCircularP a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());
    }
}
