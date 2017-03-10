/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.estructuravector;

/**
 *
 * @author Cristian C. Gallego
 */
public class Vector {

    private int tam;
    private String[] vector;

    public void crearvector(int tama) {
        this.tam = tama;
        if (this.vector == null) {
            this.vector = new String[this.tam];

        } else {

            System.out.println("NO SE PUDO CREAR EL VECTOR");

        }
    }

    public void insert(String dato, int pos) {
        if (pos < tam) {
            vector[pos] = dato;
        } else {
            System.out.println("NO SE PUDO INSERTAR, POSICION NO VALIDA");

        }
    }

    public void borrar(int pos) {
        vector[pos] = "";
    }

    public void listar() {
        if (this.vector == null) {
            System.out.println("NO HAY ELEMENTOS EN EL VECTOR");
        } else {
            for (int i = 0; i < tam; i++) {
                System.out.println(vector[i]);
            }
        }

    }

    public void actualizar(int pos, String dato) {
        if (pos > tam) {
            System.out.println("POSICION NO VALIDA");
        } else {
            vector[pos] = dato;
        }

    }

    public void buscar(String dato) {
        for (int i = 0; i < tam; i++) {
            if (vector[i].equals(dato)) {

                System.out.println("DATO EN LA POSICION " + i);
            }
        }

       }
    }

