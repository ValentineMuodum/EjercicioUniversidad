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
public class Universidad {
   
    
    Estudiante[] estudiantes;
    Modulo[] modulos;

    public Universidad(int cantidade,int cantidadm) {
        this.estudiantes=new Estudiante[cantidade];
        this.modulos=new Modulo[cantidadm];
    }

   
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
