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
public abstract class Vehiculo {
    protected String descripcion = "Vehiculo Genérico";

    public String getDescripcion() {
        return descripcion;
    }
    public abstract int getVelocidadMaxima();
    public abstract double getConsumo();
}
