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
public class Van extends Vehiculo{

    public Van() {
        descripcion="Van";
    }
    
    @Override
    public int getVelocidadMaxima() {
        return 200;
    }

    @Override
    public double getConsumo() {
        return 7.5;
    }
    
}
