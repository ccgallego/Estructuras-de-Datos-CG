/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import estructuradedatos.estructurapila.Pila;
import estructurasdedatos.estructuralistascirculares.ListasCirculares;
import estructurasdedatos.estructuraobjeto.Persona;
import estructurasdedatos.estructuraobjeto.Vehiculo;
import estructurasdedatos.estructuraslistasenlazadas.Listadoble;
import estructurasdedatos.estructuraslistasenlazadas.Listasimple;
import estructurasdedatos.estructuravector.Matriz;
import estructurasdedatos.estructuravector.Vector;

/**
 *
 * @author Cristian Camilo Gallego
 */
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ////////////PRUEBA CLASE PERSONA//////////////
        
       /* Persona juan = new Persona();
        juan.setNombre("Juan Alexis");
        juan.setDireccion("Cra 41 # 25-14");
        juan.setTelefono("3367895");
        
        
        System.out.println("Nombre:  " + juan.getNombre()+ "\n"
                          + "Direccion:  " + juan.getDireccion()
                           + "\n" + "Telefono: " + juan.getTelefono());
        
        ///////////PRUEBA CLASE VEHICULO//////////////////
        Vehiculo chevrolet = new Vehiculo();
        
        chevrolet.setModelo("2004");
        chevrolet.setNumerosoat("4587962535");
        chevrolet.setColor("Gris");
        chevrolet.setPlaca("WED 420");
        
        System.out.println("Los datos del carro son\n ");
        System.out.println("Placa: " + chevrolet.getPlaca() + "\n" + "NumeroSoat: "
                            + chevrolet.getNumerosoat() + "\n" + "Modelo: " + 
                            chevrolet.getModelo() + "\n" + "Color: " + 
                            chevrolet.getColor());
        
     */


  /////////////PRUEBA CLASE VECTOR///////////////////////
        
 /*Vector mivector = new Vector();
 
 mivector.crearvector(3);
 
 mivector.insert("david", 0);
 mivector.insert("cris", 1);
 mivector.insert("damian", 2);
 
 mivector.listar();
 mivector.buscar("felipe");
 */

 /////////////  PRUEBA CLASE MATRIZ //////////////////////
 
 /*Matriz mimatriz = new Matriz();
 
 mimatriz.crear(3, 3);
 
 mimatriz.insertar(0, 0, 4);
 mimatriz.insertar(0, 1, 2);
 mimatriz.insertar(0, 2, 6);
 mimatriz.insertar(1, 0, 9);
 mimatriz.insertar(1, 1, 3);
 mimatriz.insertar(1, 2, 1);
 mimatriz.insertar(2, 0, 5);
 mimatriz.insertar(2, 1, 8);
 mimatriz.insertar(2, 2, 0);
        
 
 
        System.out.println("\n");
 
Matriz matrizB = new Matriz();

matrizB.crear(3, 4);

matrizB.insertar(0, 0, 1);
matrizB.insertar(0, 1, 4);
matrizB.insertar(0, 2, 8);
matrizB.insertar(0, 3, -2);
matrizB.insertar(1, 0, 3);
matrizB.insertar(1, 1, 9);
matrizB.insertar(1, 2, 6);
matrizB.insertar(1, 3, 1);
matrizB.insertar(2, 0, 2);
matrizB.insertar(2, 1, 5);
matrizB.insertar(2, 2, 9);
matrizB.insertar(2, 3, 0);


        
        
 System.out.println("\n");

        
       System.out.println("MATRIZ A");
        mimatriz.listar();
        mimatriz.transpuesta();
        System.out.println("");
        
      System.out.println("MATRIZ B");
        matrizB.listar();
        System.out.println(" ");
        
        System.out.println("MULTIPLICACION A*B");
        mimatriz.multiplicar(matrizB);
        System.out.println(" \n");
        */
 
 /////////PRUEBA LISTAS SIMPLES///////////////////
 
 /*Listasimple lista1 = new Listasimple();
 
 lista1.crearlista();
 lista1.AgregarAlinicio(8);
 lista1.AgregarAlinicio(6);
 lista1.AgregarAlfinal(2);
 lista1.AgregarAlinicio(-3);
 lista1.listar();
 lista1.eliminar(8);
 lista1.listar();*/
 
 /////////////////PRUEBA LISTAS DOBLEMENTE ENLAZADAS//////////////////
 
 /*Listadoble lista2 = new Listadoble();
 
 lista2.crearlistadoble();
 lista2.insertarOrden(4);
 lista2.listar();
 lista2.insertarOrden(-3);
 lista2.listar();
 lista2.insertarOrden(6);
 lista2.listar();
 lista2.insertarOrden(7);
 lista2.listar();
 lista2.insertarOrden(8);
 lista2.listar();
 lista2.insertarOrden(0);
 lista2.listar();
 lista2.Eliminar(8);
 lista2.listar();*/
 
 VistaListasCircular vista = new VistaListasCircular();
 vista.show();
 
 ////////////////////PRUEBA DE ESTRUCUTA PILA//////////////////
 
 /*Pila mipila = new Pila();

 mipila.apilar("Cristian","Gallego","1112630610","19","sistemas");
 mipila.apilar("David","Rangel","1112627876","22","dependiente");
 mipila.listar();
 System.out.println(" ");
 mipila.desapilar();
 mipila.listar();*/
 
 
   












 

 

        
       
      
       
        
        
        
               
        
        
        
       
        
        
        
        
        
        
    }
    
}
