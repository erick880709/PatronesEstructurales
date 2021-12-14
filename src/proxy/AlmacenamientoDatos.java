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
public class AlmacenamientoDatos implements IGuardar{
    private AdministradorConexion admin;

    public AlmacenamientoDatos(AdministradorConexion admin) {
        this.admin = admin;
    }

    public void setAdmin(AdministradorConexion admin) {
        this.admin = admin;
    }
    
    @Override
    public void guardar(ArrayList datos) {
        if(this.admin.hayConexion()){
            new ObjetoRemoto().guardar(datos);
        }
        else{
            new GuardarDisco().guardar(datos);
        }
    }
}
