/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author jvelez
 */
public class Sedan extends Vehiculo{

    public Sedan() {
        descripcion="Sedan";
    }

    
    @Override
    public int getVelocidadMaxima() {
        return 220;
    }

    @Override
    public double getConsumo() {
        return 6.2;
    }
    
}
