package EjercicioString;

public class PilaLibro {
	private  Libro p[];
    private  int tope;
    private  int max;

    public PilaLibro() {
        tope = -1;
        max= 100;
        p=new Libro[max];
    }
    boolean esVacia(){
        if (tope == -1){
            return	true;
        }
        else{
        	return false;
        }
        	
    }
    boolean esLlena(){
        if(tope==max-1){
            return true;
        }
        return false;
    }
    public  void adipila(Libro dato){
        if(esLlena()){
            System.out.println("pila llena");
        }else{
            tope=tope+1;
            p[tope]=dato;
        }
    }
    public Libro elipila(){
        Libro x= new Libro();
        if (esVacia()){
            System.out.println("pila vacia");
        }else{
            x=p[tope];
            tope=tope-1;
           
        }
        return x;
    }
    public void mostrar(){
        PilaLibro aux = new PilaLibro();
        Libro x= new Libro();
        while(!esVacia()){
            
            x= elipila();
            x.mostrar();
            aux.adipila(x);
            
        }
        vaciarPila(aux);
        
        
    }
    public void vaciarPila(PilaLibro paux){
    	Libro n= new Libro();
    	while(!paux.esVacia()){
            n = paux.elipila();
            adipila(n);
        }
    }   
   
            
}
