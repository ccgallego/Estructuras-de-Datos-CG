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
public class Listasimple {

    private Nodo cabeza;
    private Nodo cola;

    public void crearlista() {
        this.cabeza = null;
        this.cola = null;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public void AgregarAlinicio(int valor) {
        Nodo nodo1 = new Nodo();
        nodo1.setDato(valor);
        if (esVacia()) {
            this.cabeza = nodo1;
            this.cola = nodo1;
        } else {
            nodo1.setSiguiente(cabeza);
            this.cabeza = nodo1;
        }
    }

    public void AgregarAlfinal(int valor) {
        Nodo nodo2 = new Nodo();
        nodo2.setDato(valor);
        if (esVacia()) {
            this.cabeza = nodo2;
            this.cola = nodo2;
        } else {
            Nodo aux= cabeza;
            while(aux.getSiguiente() != null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nodo2);
        }
    }

    public void listar() {
        if (!esVacia()) {
            Nodo aux = cabeza;
            while (aux != null) {
                System.out.print("[" + aux.getDato()+"]" + "->");
                aux = aux.getSiguiente();
            }
            System.out.println("null");
        }
    }
    
    public void eliminar(int valor){
        if(valor== cabeza.getDato()){
            this.cabeza=cabeza.getSiguiente();
        }else{
            Nodo aux=cabeza;
            while(aux.getSiguiente().getDato() != valor){
                aux=aux.getSiguiente();
            }
            Nodo sig=aux.getSiguiente().getSiguiente();
            aux.setSiguiente(sig);
        }
    }
    
    
}
