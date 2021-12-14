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
public class Gasolina extends DecoradorVehiculo{

    private Vehiculo vehiculo;

    public Gasolina(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    @Override
    public String getDescripcion() {
        return vehiculo.getDescripcion()+" Gasolina";
    }

    @Override
    public int getVelocidadMaxima() {
        return vehiculo.getVelocidadMaxima()+60;
    }

    @Override
    public double getConsumo() {
        return vehiculo.getConsumo()+1.2;
    }
    
}
