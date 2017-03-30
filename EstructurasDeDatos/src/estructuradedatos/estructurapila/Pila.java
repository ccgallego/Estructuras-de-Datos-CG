/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos.estructurapila;

import estructurasdedatos.estructuralistascirculares.Actividad;
import estructurasdedatos.estructuralistascirculares.NodoActividad;

/**
 *
 * @author Gallegos
 */
public class Pila {

    public Actividad dato;
    public NodoActividad tope;

    /**
     * @return the dato
     */
    public Actividad getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Actividad dato) {
        this.dato = dato;
    }

    public Pila() {
        dato = null;

    }

    public boolean esVacia() {
        return tope == null;
    }

    // String nombre, String apellido, String cedula,String edad, String ocupacion
    public void apilar(String nombre, String apellido, String cedula, String edad, String ocupacion) {

        NodoActividad nuevo = new NodoActividad();
        nuevo.setDato(nombre, apellido, cedula, edad, ocupacion);
        if (esVacia()) {
            tope = nuevo;
        } else {
            nuevo.setSiguiente(tope);
            tope = nuevo;
        }

    }

    public void listar() {
        if (!(tope == null)) {
            NodoActividad aux = tope;
            System.out.println("DATOS DE LA PILA ");
            while (aux != null) {

                System.out.println("[" + aux.getDato().getNombre() + " " + aux.getDato().getApellido() + " "
                        + aux.getDato().getCedula() + " " + aux.getDato().getEdad() + " " + aux.getDato().getOcupacion() + "]");

                aux = aux.getSiguiente();
            }
        }

    }
    
     public void desapilar(){
        if(esVacia())
            System.out.println("LA PILA ESTA VACIA ");
        else{
            System.out.println( "eliminado" + "[" + tope.getDato().getNombre() +  " " + tope.getDato().getApellido() + " "
                        + tope.getDato().getCedula() + " " + tope.getDato().getEdad()+ " " + tope.getDato().getOcupacion() +"]" );

            tope= tope.siguiente;
            
        }
    }

}
