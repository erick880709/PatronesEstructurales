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
public class Estudiante {
    private String nombre;
    private String apellido;
    private double promedio;
    private double promedioGeneral;

    public Estudiante(double promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }

    public double diferenciaPromedioGeneral(){
        return (((double) promedio)/promedioGeneral -1)*100;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
            
}
