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
public class Estudiante {
    private String nombre;
    private Modulo[] toma;
    private Calificacion[] calificaciones;
    public Estudiante(String nombre,int cantidadModulos) {
        this.nombre = nombre;
        this.calificaciones=new Calificacion[cantidadModulos];
    }

 

}
