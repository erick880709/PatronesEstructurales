/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.ArrayList;

/**
 *
 * @author jvelez
 */
public class GuardarDisco implements IGuardar{

    @Override
    public void guardar(ArrayList datos) {
        System.out.println("Guardando datos en el disco duro.");
    }
    
}
