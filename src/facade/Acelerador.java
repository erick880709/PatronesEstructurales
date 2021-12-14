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
public class Acelerador implements IAcelerador{

    @Override
    public void presionarAcelerador() {
        System.out.println("Acelerador Presionado");
    }

    @Override
    public void soltarAcelerador() {
        System.out.println("Acelerador Suelto");
    }
    
}
