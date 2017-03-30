/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.estructuralistascirculares;

import javax.swing.JOptionPane;

/**
 *
 * @author Gallegos
 */
public class ListasCirculares {

    private NodoActividad cabeza;

    public ListasCirculares() {
        this.cabeza = null;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public void insertarElementos(Actividad datos) {
        NodoActividad nodo1 = new NodoActividad(datos);

        if (esVacia()) {
            cabeza = nodo1;
            cabeza.setSiguiente(cabeza);
        } else {
            nodo1.siguiente = cabeza.siguiente;
            cabeza.siguiente = nodo1;
        }

    }

    public void eliminar(String dato) {
        NodoActividad aux = cabeza;
        if (cabeza.siguiente == cabeza && cabeza.dato.getNombre().equals(dato)) {
            cabeza.siguiente = null;
            cabeza = null;
        }
         else {
            while (aux.siguiente != null) {
                if (aux.siguiente.dato.getNombre().equals(dato)) {
                    NodoActividad eliminar = aux.siguiente;
                    aux.siguiente = aux.siguiente.siguiente;
                    eliminar.siguiente = null;
                    break;
                }
            }
        }
    }

    public void eliminarcabeza() {
        if (!esVacia()) {
            NodoActividad aux = cabeza;
            while (aux.siguiente != cabeza) {
                aux = aux.siguiente;
            }
            cabeza = cabeza.siguiente;
            aux.siguiente = cabeza;
        }
        cabeza.siguiente = null;
        cabeza = null;
    }

    public void listar() {
        if (!esVacia()) {
            NodoActividad aux = cabeza;
            System.out.println(aux.getDato());
            while (aux.getSiguiente() != cabeza) {
                aux = aux.getSiguiente();
                System.out.println(aux.getDato());
            }
        }
    }
    public String presentar(){
        String texto="";
        String texto2="";
       
        if(!esVacia()){
        NodoActividad aux=cabeza;
        texto=aux.dato.getNombre()+ " "+ aux.dato.getApellido()+ " "+ aux.dato.getCedula() + " "+
              aux.dato.getEdad()+ " " + aux.dato.getOcupacion()+ "\n" ;
        System.out.println(texto+"\n");
        while(aux.siguiente!=cabeza){
            aux=aux.siguiente;
            texto+=aux.dato.getNombre()+" "+ aux.dato.getApellido()+ " "+ aux.dato.getCedula() + " "+
              aux.dato.getEdad()+ " " + aux.dato.getOcupacion()+ "\n";
            System.out.println(texto+"\n");
        }
        }
        return texto;
        
    }

    public void buscar(String nombre) {

        if (!esVacia()) {
            NodoActividad aux = cabeza;
            if (aux.dato.getNombre().equals(nombre)) {
                JOptionPane.showMessageDialog(null, "Los datos del elemento encontrado son:"
                        + " " + aux.dato.getNombre() + "  "+ aux.dato.getApellido()+ " " + aux.dato.getCedula()
                        + " "+ aux.dato.getEdad()+ " " + aux.dato.getOcupacion()+ "\n" ) ;
                         
            } else {
                while (aux.siguiente != cabeza) {
                    if (aux.siguiente.dato.getNombre().equals(nombre)) {
                        JOptionPane.showMessageDialog(null, "Los datos del elemento encontrado son:"
                                + " " + aux.dato.getNombre() + "  "+ aux.dato.getApellido()+ " " + aux.dato.getCedula()
                        + " "+ aux.dato.getEdad()+ " " + aux.dato.getOcupacion()+ "\n" ) ;
                       // break;
                    }
                    break;
                   // aux = aux.siguiente;
                }
                aux = aux.siguiente;
            }

        }
    }
    
    

   
}
