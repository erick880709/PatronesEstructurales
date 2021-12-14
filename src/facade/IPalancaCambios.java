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
public interface IPalancaCambios {
    public void aumentarVelocidad(int velocidad);
    public void puntoMuerto();
    public int getVelocidadActual();
}
