/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author jvelez
 */
public class AdministradorConexion {
    public boolean hayConexion = true;

    public AdministradorConexion() {
        hayConexion=true;
    }
    
    public void conectar(){
        hayConexion=true;
    }
    
    public void desconectar(){
        hayConexion=false;
    }
    
    public boolean hayConexion(){
        return hayConexion;
    }
}
