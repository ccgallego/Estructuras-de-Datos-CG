/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuracarro.estructuraobjeto;

/**
 *
 * @author Gallegos
 */
public class Vehiculo {
    //declaracion de variables
    
    private String placa;
    private String modelo;
    private String numerosoat;
    private String Color;

    
    // encapsulamiento de campos
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the numerosoat
     */
    public String getNumerosoat() {
        return numerosoat;
    }

    /**
     * @param numerosoat the numerosoat to set
     */
    public void setNumerosoat(String numerosoat) {
        this.numerosoat = numerosoat;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }
    
}
