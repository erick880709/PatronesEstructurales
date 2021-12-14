/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author jvelez
 */
public class Main {
    public static void main(String[] args) {
        final double promedioEstudiantes = 6.0;
        String nombres[] = {"Pedro","Luis","Tomas"};
        String apellidos[] = {"Torres","Perez","Sanchez"};
        double promedios[]={6.0,7.0,9.0};
        
        Estudiante estudiante = new Estudiante(promedioEstudiantes);
        
        for (int i = 0; i < nombres.length; i++) {
            estudiante.setNombre(nombres[i]);
            estudiante.setApellido(apellidos[i]);
            estudiante.setPromedio(promedios[i]);
            
            System.out.println(nombres[i]+": "+estudiante.diferenciaPromedioGeneral());
        }
    }
}
