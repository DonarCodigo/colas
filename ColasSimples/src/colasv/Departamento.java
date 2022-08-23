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
public class Departamento {
    private int idDpto,superficie,poblacion;
    private String nombre,capital;
    
    Departamento(int a, String b, String c, int d, int e)
    {
        idDpto=a;
        nombre=b;
        capital=c;
        superficie=d;
        poblacion=e;
        
    }

    public int getIdDpto() {
        return idDpto;
    }

    public void setIdDpto(int idDpto) {
        this.idDpto = idDpto;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void mostrar()
    {
        System.out.print("<"+idDpto+" "+nombre+" "+capital+" "+superficie+" "+poblacion+">");
    }
}
