/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuracarro;

import estructuracarro.estructuraobjeto.Vehiculo;

/**
 *
 * @author Gallegos
 */
public class EstructuraCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
    }
    
}
