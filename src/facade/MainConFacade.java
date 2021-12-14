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
public class MainConFacade {
    public static void main(String[] args) {
        IAcelerador acelerador = new Acelerador();
        IClutch clutch = new Clutch();
        IPalancaCambios palancaCambios = new PalancaCambios();
        Facade facade = new Facade(clutch, acelerador, palancaCambios);
        facade.aumentarVelocidad();
        facade.aumentarVelocidad();
        facade.disminuirVelocidad();
    }
}
