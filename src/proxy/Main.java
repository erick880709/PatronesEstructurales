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
public class Main {
    public static void main(String[] args) {
        AdministradorConexion admin = new AdministradorConexion();
        AlmacenamientoDatos almacenamientoDatos = new AlmacenamientoDatos(admin);
        ArrayList datos = new ArrayList();              
        almacenamientoDatos.guardar(datos);
        admin.desconectar();
        almacenamientoDatos.setAdmin(admin);
        almacenamientoDatos.guardar(datos);
    }
}
