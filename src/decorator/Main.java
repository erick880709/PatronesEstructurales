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
public class Main {
    public void mostrarCaracteristicas(Vehiculo vehiculo){
        System.out.println(vehiculo.getDescripcion());
        System.out.println("\tVelocidad máxima:"+vehiculo.getVelocidadMaxima()+"km/h");
        System.out.println("\tConsumo promedio:"+vehiculo.getConsumo()+"litros/100km");
    }
    public static void main(String[] args) {
        Vehiculo van = new Van();
        Vehiculo sedan = new Sedan();
        Main main = new Main();
        main.mostrarCaracteristicas(van);
        main.mostrarCaracteristicas(sedan);
        
        Vehiculo sedan2 = new Sedan();
        sedan2=new Gasolina(sedan2);
        main.mostrarCaracteristicas(sedan2);
        sedan2=new Turbo(sedan2);
        main.mostrarCaracteristicas(sedan2);
        sedan2=new Inyeccion(sedan2);
        main.mostrarCaracteristicas(sedan2);
        
    }
}
