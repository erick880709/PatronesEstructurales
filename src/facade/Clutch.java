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
public class Clutch implements IClutch{

    @Override
    public void presionarClutch() {
        System.out.println("Clutch Presionado");
    }

    @Override
    public void soltarClutch() {
        System.out.println("Clutch Suelto");
    }
    
}
