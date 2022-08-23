
package hotelbuendescanso.Ejercicio2;

public class Mascotas {
       private String nombre,raza, incapacidad;
       private int edad;

    public Mascotas(String nombre, String raza, int edad,String incapacidad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.incapacidad = incapacidad;
    }

    public Mascotas() {
        this.nombre = " ";
        this.raza = " ";
        this.edad = 0;
        this.incapacidad = " ";
    }

    public String getIncapacidad() {
        return incapacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setIncapacidad(String incapacidad) {
        this.incapacidad = incapacidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrar(){
        System.out.println("Nombre: "+nombre+" raza: "+raza+" edad: "+edad+" incapacidad: "+incapacidad);
    }
}
