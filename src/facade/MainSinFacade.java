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
public class MainSinFacade {

    public static void main(String[] args) {
        IAcelerador acelerador = new Acelerador();
        IClutch clutch = new Clutch();
        IPalancaCambios palancaCambios = new PalancaCambios();

        acelerador.soltarAcelerador();
        clutch.presionarClutch();
        palancaCambios.puntoMuerto();
        palancaCambios.aumentarVelocidad(3);
        clutch.soltarClutch();
        acelerador.presionarAcelerador();
    }
}
