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
public class Facade {
    private IClutch clutch;
    private IAcelerador acelerador;
    private IPalancaCambios palancaCambios;

    public Facade(IClutch clutch, IAcelerador acelerador, IPalancaCambios palancaCambios) {
        this.clutch = clutch;
        this.acelerador = acelerador;
        this.palancaCambios = palancaCambios;
    }
    
    public void aumentarVelocidad(){
        acelerador.soltarAcelerador();
        clutch.presionarClutch();
        palancaCambios.puntoMuerto();
        if(palancaCambios.getVelocidadActual()<5){
            palancaCambios.aumentarVelocidad(palancaCambios.getVelocidadActual()+1);
        }
        clutch.soltarClutch();
        acelerador.presionarAcelerador();
    }
    
    public void disminuirVelocidad(){
        acelerador.soltarAcelerador();
        clutch.presionarClutch();
        palancaCambios.puntoMuerto();
        if(palancaCambios.getVelocidadActual()>1){
            palancaCambios.aumentarVelocidad(palancaCambios.getVelocidadActual()-1);
        }
        clutch.soltarClutch();
        acelerador.presionarAcelerador();
    }
}
