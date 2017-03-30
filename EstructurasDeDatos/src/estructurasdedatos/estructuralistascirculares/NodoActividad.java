/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.estructuralistascirculares;

/**
 *
 * @author Gallegos
 */
public class NodoActividad {
    
    public Actividad dato;
    public NodoActividad siguiente;
    
    public NodoActividad(Actividad dato){
        this.dato=dato;
        siguiente=null;
    }

    public NodoActividad() {
    }


    /**
     * @return the dato
     */
    public Actividad getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(String nombre, String apellido, String cedula,String edad, String ocupacion) {
        Actividad a= new Actividad(nombre,apellido,cedula,edad,ocupacion);
        this.dato = a;
    }

    /**
     * @return the siguiente
     */
    public NodoActividad getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoActividad siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
