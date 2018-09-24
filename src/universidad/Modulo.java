/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author Valentine Chimezie
 */
public class Modulo {
    private String Conferencista;
    private String Nombre;
    private Calificacion[] calificaciones;

    public Modulo(String Conferencista, String Nombre) {
        this.Conferencista = Conferencista;
        this.Nombre = Nombre;
        
    }

    public String getConferencista() {
        return Conferencista;
    }

    public void setConferencista(String Conferencista) {
        this.Conferencista = Conferencista;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Calificacion[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Calificacion[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    

}
