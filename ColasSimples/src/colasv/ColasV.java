
package colasv;
import java.util.*;

public class ColasV {

    public static void main(String[] args) {
        // TODO code application logic here
        CSimpleD A=new CSimpleD();
        Departamento d1=new Departamento(11,"La Paz","La Paz",100,343);
        Departamento d2=new Departamento(22,"Beni","Trinidad",100,56);
        Departamento d3=new Departamento(33,"Chuquisaca","Sucre",100,234);
        Departamento d4=new Departamento(44,"Oruro","Oruro",100,58);
        Departamento d5=new Departamento(88,"Potosi","Potosi",100,100);
        A.adicionar(d1);
        A.adicionar(d2);
        A.adicionar(d3);
        A.adicionar(d4);
        A.adicionar(d5);
        A.mostrar();
        
        CCircularP B=new CCircularP();
        Provincia p1=new Provincia(111,"n1","c1",10,10,22);
        Provincia p2=new Provincia(112,"n2","c2",21,21,11);
        Provincia p3=new Provincia(132,"n3","c3",43,32,33);
        Provincia p4=new Provincia(134,"n4","c4",7,234,22);
        Provincia p5=new Provincia(234,"n5","c5",23,54,33);
        Provincia p6=new Provincia(342,"n6","c6",65,64,55);
        Provincia p7=new Provincia(231,"n7","c7",32,43,88);
        Provincia p8=new Provincia(133,"n8","c8",64,56,44);
        Provincia p9=new Provincia(411,"n9","c9",11,366,22);
        B.adicionar(p1);
        B.adicionar(p2);
        B.adicionar(p3);
        B.adicionar(p4);
        B.adicionar(p5);
        B.adicionar(p6);
        B.adicionar(p7);
        B.adicionar(p8);
        B.adicionar(p9);
        B.mostrar();
        //problemas
        //mostrar cada departamento con sus provincias
        ejer1(A,B);
        //ordenar los departamento por la poblacion
        System.out.println("\nORDENACION DEPARTAMENTOS");
        ejer2(A);
        A.mostrar();
        //QUEUE  SIN MODULARIZAR 
        Queue<Departamento> C=new LinkedList<Departamento>();
        C.add(d1);C.add(d2);C.add(d3);C.add(d4);C.add(d5);
        System.out.println("\n QUEUE DE DEPARTAMENTOS "+C.size());
		while(!C.isEmpty())
		{
			Departamento x=C.remove();
			x.mostrar();
		}
        Queue<Provincia> D=new LinkedList<Provincia>();
        D.add(p1);D.add(p2);D.add(p3);D.add(p4);D.add(p5);D.add(p6);D.add(p7);D.add(p8);D.add(p9);
        
        System.out.println("\n QUEUE DE PROVINCIAS "+ D.size());
        Queue<Provincia> DD=new LinkedList<Provincia>();
		while(!D.isEmpty())
		{
			Provincia x=D.remove();
			x.mostrar();
                        DD.add(x);
		}
        while(!DD.isEmpty())
            D.add(DD.remove());
    }
    public static void ejer2(CSimpleD a)
    {
        CSimpleD aux=new CSimpleD();
        CSimpleD R=new CSimpleD();
        while(!a.esvacia()){
            Departamento men=a.eliminar();
            while(!a.esvacia())
            {
                Departamento dx=a.eliminar();
                if(dx.getPoblacion()<=men.getPoblacion())
                {
                    aux.adicionar(men);
                    men=dx;
                }
                else
                    aux.adicionar(dx);
            }
            R.adicionar(men);
            a.vaciar(aux);
        }
        a.vaciar(R);
    }
    public static void ejer1(CSimpleD a, CCircularP b)
    {
        CSimpleD aa=new CSimpleD();
        while(!a.esvacia())
        {
            Departamento dx=a.eliminar();
            System.out.println("\nDEPARTAMENTO : ");
            dx.mostrar();
            //.....provincias
            dxProv(dx.getIdDpto(),b);
            aa.adicionar(dx);
        }
        a.vaciar(aa);
    }
    public static void dxProv(int id, CCircularP b)
    {
        CCircularP bb=new CCircularP();
        System.out.println("\nPROVINCIAS : ");
        while(!b.esvacia())
        {
            Provincia px=b.eliminar();
            if(px.getIdDpto()==id)
                px.mostrar();
            bb.adicionar(px);
        }
        b.vaciar(bb);
    }
    
}
