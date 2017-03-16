/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.estructuraslistasenlazadas;

/**
 *
 * @author Cristian C. Gallego
 */
public class Nododoble {
    private int dato;
    private Nododoble siguiente;
    private Nododoble anterior;

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public Nododoble getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nododoble siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Nododoble getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nododoble anterior) {
        this.anterior = anterior;
    }
}
