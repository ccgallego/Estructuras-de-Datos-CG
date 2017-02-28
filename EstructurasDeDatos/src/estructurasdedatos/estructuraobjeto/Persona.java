/*
FECHA: 22-FEB-2017
DESCRIPCION: Clase persona, una clase una una pantilla de donde puedo
             instanciar objetos de tipo persona.
             Una instancia es una variable o un lugar en la memoria
             del computador y almacena los atributos.

 */
package estructurasdedatos.estructuraobjeto;

/**
 *
 * @author Cristian Camilo Gallego
 */
public class Persona {
    
   private String nombre;
   private String cedula;
   private String direccion;
   private String telefono;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
   
    
}
