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
public class Main {
    public static void main(String[] args) {
        Mascotas m = new Mascotas("totto", "beagle", 8, "si");
        Mascotas m1 = new Mascotas("Huachi", "Pastor Aleman", 1, "no");
        Mascotas m2 = new Mascotas("Jachico", "chapi", 1, "no");
        Mascotas m3 = new Mascotas("Chapi", "Gran danez", 5, "si");
        Mascotas m4 = new Mascotas("Alfa", "beagle", 6, "no");
        Mascotas m5 = new Mascotas("Omega", "San Bernardo", 3, "no");
        
        ColaCircularMascotas c = new ColaCircularMascotas();
        
        c.adicionar(m);
        c.adicionar(m1);
        c.adicionar(m2);
        c.adicionar(m3);
        c.adicionar(m4);
        c.adicionar(m5);
        c.mostrar();
        System.out.println("/**********FRENTE INCAPACIDAD***********");
        c.FrenteIncapacidad();
        c.mostrar();
        System.out.println("/*****ELIMINAR LOS PERROS DE RAZA BEAGLE*************");
        c.eliminarBeagle("beagle");
        System.out.println("/***************LLEVAR AL FINAL CON AÑO IGUAL A 1**************");
        c.llevaalFinal();
        
    }
}
