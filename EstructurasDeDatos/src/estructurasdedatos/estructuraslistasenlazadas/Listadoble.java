/*13-MARZO-2017
  PROGRAMA PARA EL MANEJO DE LISTAS DOBLEMENTE ENLAZADAS CON SUS METODOS
*/
package estructurasdedatos.estructuraslistasenlazadas;

/**
 *
 * @author Cristian C. Gallego
 */
public class Listadoble {

    //VARIABLES TIPO NODO
    private Nododoble cabeza;
    private Nododoble cola;

    // CREA UNA LISTA DOBLE 
    public void crearlistadoble() {
        this.cabeza = null;
        this.cola = null;
    }

    //VERIFICA SI LA LISTA ESTA VACIA
    public boolean esVacia() {
        return cabeza == null;
    }

    //INSERTA UN NODO POR EL FINAL O COLA
    public void insertarFinal(int valor) {
        Nododoble nodo1 = new Nododoble();
        nodo1.setDato(valor);
        if (this.cabeza == null) {
            this.cabeza = nodo1;
            this.cola = nodo1;
        } else {
            Nododoble aux = cabeza;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo1);
            nodo1.setAnterior(aux);
        }
    }

    //INSERTA UN NODO AL INICIO O CABEZA
    public void insertarInicio(int valor) {
        Nododoble nodo2 = new Nododoble();
        nodo2.setDato(valor);
        if (esVacia()) {
            this.cabeza = nodo2;
            this.cola = nodo2;
        } else {
            nodo2.setSiguiente(cabeza);
            cabeza.setAnterior(nodo2);
            this.cabeza = nodo2;
        }
    }

    //ELIMINA EL NODO QUE CONTENGA EL VALOR
    public void Eliminar(int valor) {
        if (!esVacia()) {
            Nododoble aux = cabeza;
            Nododoble ant = null;
            while (aux != null) {
                if (aux.getDato() == valor) {
                    if (ant == null) {
                        this.cabeza = cabeza.getSiguiente();
                        aux.setSiguiente(null);
                        aux = cabeza;
                    } else {
                        ant.setSiguiente(aux.getSiguiente());
                        aux.setSiguiente(null);
                        aux = ant.getSiguiente();
                    }
                } else {
                    ant = aux;
                    aux = aux.getSiguiente();
                }
            }
        }
    }

    //IMPRIME LOS DATOS DE LOS NODOS
    public void listar() {
        if (!esVacia()) {
            Nododoble aux = cabeza;
            while (aux != null) {
                System.out.print("[" + aux.getDato() + "]" + "<->");
                aux = aux.getSiguiente();
            }
            System.out.println("null");
        }
    }

    //INSERTA DATOS DE MANERA ORDENADA
    public void insertarOrden(int valor) {
        Nododoble nodo2 = new Nododoble();
        nodo2.setDato(valor);
        if (esVacia()) {
            this.cabeza = nodo2;
            this.cola = nodo2;
        } else {
            nodo2.setSiguiente(cabeza);
            cabeza.setAnterior(nodo2);
            this.cabeza = nodo2;
            // PARA QUE INGRESEN ORDENADOS...
            while (true) {
                Nododoble aux = cabeza;
                Nododoble temp = cabeza.getSiguiente();
                while (temp.getSiguiente() != null) {
                    if (aux.getDato() > temp.getDato()) {
                        int auxi = aux.getDato();
                        aux.setDato(temp.getDato());
                        temp.setDato(auxi);
                        
                    }
                    aux = temp;
                    temp = aux.getSiguiente();

                    if (temp != null && temp.getSiguiente() == null) {
                        if (aux.getDato() > temp.getDato()) {
                            int aux2 = aux.getDato();
                            aux.setDato(temp.getDato());
                            temp.setDato(aux2);
                            
                        }
                    }
                }
                
                    break;
            }

        }
    }

}
