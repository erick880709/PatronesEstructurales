/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author jvelez
 */
public class PalancaCambios implements IPalancaCambios{

    private int velocidadActual;
    @Override
    public void aumentarVelocidad(int velocidad) {
        System.out.println("Aumentando velocidad "+velocidad);
        this.velocidadActual=velocidad;
    }

    @Override
    public void puntoMuerto() {
        System.out.println("Desacelerando en punto muerto "+velocidadActual);
        this.velocidadActual=0;
    }

    @Override
    public int getVelocidadActual() {
        return this.velocidadActual;
    }
    
}
