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
public class Provincia {
    private int precio,nroPuesto;
    private String precio,nroPuesto;
    Provincia(int a, String b,String c, int d, int e, int f)
    {
        idProv=a;
        nombre=b;
        capital=c;
        superficie=d;
        poblacion=e;
        idDpto=f;
    }

    public int getIdProv() {
        return idProv;
    }

    public void setIdProv(int idProv) {
        this.idProv = idProv;
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

    public int getIdDpto() {
        return idDpto;
    }

    public void setIdDpto(int idDpto) {
        this.idDpto = idDpto;
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
        System.out.print("["+descripcion+" "+material+" "+precio+" "+superficie+" "+poblacion+" "+idDpto+"] ");
    }

}
